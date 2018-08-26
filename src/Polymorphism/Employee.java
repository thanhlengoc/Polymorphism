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
public class Employee {
    private String name;
    private String address;
    private int number;
    public Employee(String name, String address, int number) {
        System.out.println("Contructor of employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public void mailCheck() {
        System.out.println("Mailing a check to: "+this.name+" "+this.address);
    }
    public String getName() {
        return  name;
    }
    public String toString() {
        return name+" "+address+" "+number;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }
    public int getNumber(){
        return number;
    }
}
