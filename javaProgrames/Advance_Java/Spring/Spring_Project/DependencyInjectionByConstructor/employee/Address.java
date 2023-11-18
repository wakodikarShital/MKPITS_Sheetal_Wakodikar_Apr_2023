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
public class Address {
    private String city;
    private String state;
    
   public Address(String city,String state){
       this.city=city;
       this.state=state;
   }

    @Override
    public String toString() {
        return "city = " + city + " , state = " + state ;
    }
   
   
    
    
}
