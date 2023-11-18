/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author LENOVO
 */
public class Employee {
    
    private int id;
    private String name;
    private String city;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public void displayInfo(){
        System.out.println("---------------- Employee details ----------------");
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("City = " + city);
    }
    
}
