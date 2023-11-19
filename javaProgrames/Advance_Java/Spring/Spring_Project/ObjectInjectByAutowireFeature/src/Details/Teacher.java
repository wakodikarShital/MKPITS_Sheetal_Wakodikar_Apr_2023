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
public class Teacher {
    private int id;
    private String name;

    public Teacher(){
    }
    
    
    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return  "id = " + id + "\nname = " + name;
    }
    
    

   
    
    
}
