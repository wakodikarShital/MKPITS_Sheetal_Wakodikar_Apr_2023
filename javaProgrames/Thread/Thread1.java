public class Thread1 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<=100;i++){
            if (i%2==0) {
                System.out.println("Even No." + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}
