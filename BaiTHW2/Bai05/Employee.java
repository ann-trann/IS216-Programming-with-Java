/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai05;

/**
 *
 * @author 7713b
 */
public class Employee extends Person{
    private float salary;
    
    public void addSalary(){
        salary *= 1.1;
    }
    
    public void addSalary(double salary){
        this.salary += salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    void show() {
        System.out.println("Ten la: " + this.getName() + ", tuoi la: " + this.getAge() + ", luong la: "+ this.getSalary());
    }
}