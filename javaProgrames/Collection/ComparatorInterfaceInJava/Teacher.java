package Comparator;

public class Teacher {
    public int id;
    public String name;
    public String salary;

    public Teacher(int id,String name,String salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id = "+ id+", Name = "+name+", salary = " +salary;
    }
}
