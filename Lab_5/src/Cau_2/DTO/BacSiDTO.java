/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.DTO;

/**
 *
 * @author trant
 */
public class BacSiDTO {
    private String MaBS;
    private String TenBS;

    public BacSiDTO() {
    }

    public BacSiDTO(String MaBS, String TenBS) {
        this.MaBS = MaBS;
        this.TenBS = TenBS;
    }

    public String getMaBS() {
        return MaBS;
    }

    public String getTenBS() {
        return TenBS;
    }
    
    public String toString() {
        return TenBS;
    }
    
}
