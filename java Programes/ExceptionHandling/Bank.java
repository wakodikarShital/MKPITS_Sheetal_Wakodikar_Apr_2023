public class Bank {
    private int balance;
    //getter


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int withdrawl(int amtwith)throws Withdrwal {
        if (amtwith < 100)
            throw new Withdrwal();
        System.out.println(balance = balance - amtwith);
            return balance;



    }
    public int deposit(int amtdep) throws Deposit{
        if (amtdep<100)
            throw new Deposit();
        System.out.println(balance=balance+amtdep);
        return balance;

    }
}
