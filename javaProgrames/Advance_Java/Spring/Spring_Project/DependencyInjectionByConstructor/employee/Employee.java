package employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Employee {
    
    private String id;
    private String name;
    private Address address;

    public Employee(String id) {
        this.id = id;
    }
    
//    public Employee(String name){
//        this.name=name;
//    }
    
    public Employee(String id,String name,Address address){
        this.id = id;
        this.name=name;
        this.address=address;
    }
    
    public void display(){
        System.out.println("Employee Details ------------------" );
        System.out.println("Id = " + id );
        System.out.println("Name = " + name );
        System.out.println(address.toString());
    }
    
}
