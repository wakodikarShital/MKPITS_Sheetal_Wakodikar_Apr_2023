/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Details;

/**
 *
 * @author LENOVO
 */
public class Admin {
    private int id;
    private String name;
    private Teacher teacher;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    
    public void displayInfo(){
        System.out.println("---------- Admin Information ---------------");
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("Teacher Information :");
        System.out.println(teacher);
        
    }
    
    
}
