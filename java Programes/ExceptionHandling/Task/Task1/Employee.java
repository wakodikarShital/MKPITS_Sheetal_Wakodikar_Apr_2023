package Task1;

abstract class Employee {
    String name;
    int paymentPerHours;
    //getter


    public int getPaymentPerHours() {
        return paymentPerHours;
    }

    public String getName() {
        return name;
    }

    //setter


    public void setPaymentPerHours(int paymentPerHours) {
        this.paymentPerHours = paymentPerHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void calculateSalary();
}
