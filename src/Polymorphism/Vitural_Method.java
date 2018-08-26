/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism; //tinh Da hinh

/**
 *
 * @author ThanhLe
 */
import Polymorphism.Employee;
import Polymorphism.Salary;

public class Vitural_Method {
    public static void main(String args[]){
        Salary s = new Salary("ThanhLe", "sai gon", 3, 9000);
        Employee e = new Salary("ThuanNgan", "nha trang", 3, 7000);
        System.out.println("call mailcheck using Salary reference--");
        s.mailCheck();
        System.out.println("cll mailcheck using employee reference--");
        e.mailCheck();
    }
}
