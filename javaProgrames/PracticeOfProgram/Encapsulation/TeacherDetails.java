package Encapsulation;

public class TeacherDetails {
    private int id;
    private String name;
    private String address;
    private String city;
    private String email;
    private double salary;

    //-------------------- getter ---------------------

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getCity(){
        return city;
    }

    public String getEmail(){
        return email;
    }

    public double getSalary(){
        return salary;
    }

    //--------------------- setter -----------------------

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public  void setAddress(String address){
        this.address=address;
    }

    public  void setCity(String city){
        this.city=city;
    }

    public  void  setEmail(String email){
        this.email=email;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }


}
