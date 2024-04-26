/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_2.Cau1_Person;

/**
 *
 * @author trant
 */
public class Test {
    public static void main(String[] args){
        Employee emp = new Employee("Nguyen Van A", 20, 10000000);
        emp.show();
        System.out.println("--- Luong nhan vien khi tang theo ti le mac dinh 10%:");
        emp.addSalary();
        emp.show();
        System.out.println("--- Luong nhan vien khi tang them gia tri cu the (5000000):");
        emp.addSalary(5000000);
        emp.show();
    }
}
