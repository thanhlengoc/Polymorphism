/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author ThanhLe
 */
import Polymorphism.Employee;

public class Salary extends Employee {
    private double salary;
    
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }
    public void mailCheck() {
        System.out.println("Within mail check of a salary class.");
        System.out.println("Mailing a check to: "+getName()+" with salary "+salary);
    }
    public void setSalary(double newSalary){
        if(newSalary >= 0.0)
            salary = newSalary;
    }
    public double getSalary() {
        return salary;
    }
    public double computePay() {
        System.out.println("computer salary pay for: "+getName());
        return salary/52;
    }
}
