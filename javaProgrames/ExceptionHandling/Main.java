public class Main {
    public void exceptionMethod(){
//        int num[]={0,1,2,3,4,5};
//
//        try {
//            for (int i=0;i<7;i++) {
//                System.out.println(num[i]);
//            }
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("Array length is 6 value not available");
//        }
    }

    public static void main(String[] args) {
//        Main main =new  Main();
//        main.exceptionMethod();
        Bank bank=new Bank();
        bank.setBalance(500);
        System.out.println( "Balance : "+bank.getBalance());
        try {
            System.out.println("Deposit ="+ bank.deposit(50));
            System.out.println("Withdrawal ="+bank.withdrawl(50));

        }catch (Deposit e){

            System.out.println(e.depositeMethod());
        }
        catch (Withdrwal e){
            System.out.println(e.withdrwalMethod());
        }




    }

}