/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_4.model;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author trant
 */

public class DSSach {
    public List<Sach> dssach;

    public DSSach() {
        dssach = new ArrayList<Sach>();
    }

    public DSSach(List<Sach> dssach) {
        this.dssach = dssach;
    }
    
    public int SLSach()
    {
        return this.dssach.size();
    }
    
    public boolean TimSach (int MaSach)
    {
        for(Sach s: dssach)
        {
            if(s.getMaSach()==MaSach)
                return true;
        }
        return false;
    }
    
    public int TimViTriSach(int MaSach)
    {
        for(Sach s : dssach)
        {
            if(s.getMaSach()== MaSach)
                return dssach.indexOf(s);
        }
        return -1;
    }
    
    public Sach TimSachTheoViTri(int i)
    {
        return this.dssach.get(i);
    }
    
    public void Themsach(Sach s)
    {
        if(this.TimSach(s.getMaSach())==false) {
            dssach.add(s);
//            JOptionPane.showMessageDialog(null, "Thêm sách thành công");
        }
        else
            JOptionPane.showConfirmDialog(null,"Không thêm được do trùng mã sách","OK",JOptionPane.CLOSED_OPTION);
    }
    
    public void XoaSach (int MaSach)
    {
        boolean flag = true;
        for(Sach s : dssach)
        {
            if(s.getMaSach()==MaSach)
            {
                flag = false;
                dssach.remove(dssach.indexOf(s));
                dssach.remove(s);
                JOptionPane.showConfirmDialog(null,"Đã xoá sách","OK", JOptionPane.CLOSED_OPTION);
                break;
            }
        }
        if (flag) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy sách có mã " + MaSach);
        }
    }
    
    public void SuaSach(Sach sach) {
        for (int i = 0; i < dssach.size(); i++) {
            if (dssach.get(i).getMaSach() == sach.getMaSach()) {
                dssach.set(i, sach);
                break;
            }
        }
    }

    // lay ra sach theo ma sach
    public Sach getSach(int maSach) {
        for (Sach s : dssach) {
            if (s.getMaSach() == maSach) {
                return s;
            }
        }
        return null;
    }

    public List<Sach> getDssach() {
        return dssach;
    }
    
    
}