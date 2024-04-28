/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_2.Cau1_Person;

/**
 *
 * @author trant
 */

import java.util.Scanner;
public class Employee extends Person {
    private int salary;

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
    public void show(){
        System.out.println(this.getName()+"\t"+this.getAge()+"\t"+this.salary);
    }
    
    public void addSalary(){
        this.salary += this.salary * 0.01;
    }
    
    public void addSalary(float tangThem){
        this.salary += tangThem;
    }
}
