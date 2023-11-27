package Encapsulation;

public class EmployeeDetailsFromUser {
    private int id;
    private String name;
    private double salary;

    //getter
    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    //setter

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

}
