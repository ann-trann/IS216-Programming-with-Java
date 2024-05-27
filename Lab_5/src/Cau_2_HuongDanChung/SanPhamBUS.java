/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2_HuongDanChung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author trant
 */
public class SanPhamBUS {
    private SanPhamDAO sanPhamDAO;

    public SanPhamBUS() {
        sanPhamDAO = new SanPhamDAO();
    }

    public boolean addSanPham(SanPhamDTO sp) throws SQLException {
        validateSanPham(sp);
        
        Connection con = OracleConnection.getInstance().getConnection();
        
        String selectSql = "SELECT MASP FROM SANPHAM WHERE MASP = ?";
        PreparedStatement selectStatement = con.prepareStatement(selectSql);
        selectStatement.setString(1, sp.getMaSP());
        
        ResultSet resultSet = selectStatement.executeQuery();
        
        if (resultSet.next()) {
            JOptionPane.showMessageDialog(null, "Mã sản phẩm đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            sanPhamDAO.insert(sp);
            return true;
        }
    }

    public boolean updateSanPham(SanPhamDTO sp) throws SQLException {
        validateSanPham(sp);
        
        Connection con = OracleConnection.getInstance().getConnection();
        
        String selectSql = "SELECT MASP FROM SANPHAM WHERE MASP = ?";
        PreparedStatement selectStatement = con.prepareStatement(selectSql);
        selectStatement.setString(1, sp.getMaSP());
        
        ResultSet resultSet = selectStatement.executeQuery();
        
        if (!resultSet.next()) {
            JOptionPane.showMessageDialog(null, "Mã sản phẩm không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            sanPhamDAO.update(sp);
            return true;
        }
        
    }

    public boolean deleteSanPham(SanPhamDTO sp) throws SQLException {
        Connection con = OracleConnection.getInstance().getConnection();
        String selectSql = "SELECT MASP FROM SANPHAM WHERE MASP = ? AND TENSP = ? AND GIA = ?";
        PreparedStatement selectStatement = con.prepareStatement(selectSql);
        selectStatement.setString(1, sp.getMaSP());
        selectStatement.setString(2, sp.getTenSP());
        selectStatement.setInt(3, sp.getGia());
        
        ResultSet resultSet = selectStatement.executeQuery();
        
        if (!resultSet.next()) {
            JOptionPane.showMessageDialog(null, "Thông tin sản phẩm không đúng. Xóa thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            sanPhamDAO.delete(sp);
            return true;
        }
    }

    private void validateSanPham(SanPhamDTO sp) {
        if (sp.getMaSP().length() != 4) {
            throw new IllegalArgumentException("MaSP có 4 ký tự");
        } else {
        }
        if (sp.getTenSP() == null || sp.getTenSP().isEmpty()) {
            throw new IllegalArgumentException("TenSP không được bỏ trống");
        }
        if (sp.getGia() <= 0) {
            throw new IllegalArgumentException("Gia phai lon hon 0");
        }
    }
}
