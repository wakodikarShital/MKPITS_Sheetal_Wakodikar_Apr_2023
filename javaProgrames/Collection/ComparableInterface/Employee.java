package ComparableInterface;

public class Employee implements Comparable<Employee>  {
    public int id;
    public String name;

    public Employee(int id, String name){
        this.id=id;
        this.name=name;

    }

    public int getId() {
        return id;
    }

    public String getName()

    {
        return name;
    }

    @Override
    public String toString() {
        return "id = "+ id + ", name = "+ name;
    }


    @Override
    public int compareTo(Employee o1) {

            return name.compareTo(o1.getName());
    }



}
