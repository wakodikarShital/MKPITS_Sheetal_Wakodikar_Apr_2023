public class Loan {
    private String accountNumber;
    private double amount;
    private int Duration;

    //  public Loan()
//  {
//    System.out.println("Default");
//  }
    public Loan(String accountNumber, double amount, int duration) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.Duration = duration;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public int getDuration() {
        return Duration;
    }
}
