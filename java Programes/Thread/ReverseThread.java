public class ReverseThread implements Runnable {
    public void run(){
        while(true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getPriority());

    }
}
}