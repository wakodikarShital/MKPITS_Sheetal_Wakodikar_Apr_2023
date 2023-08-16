public class Thread2 implements Runnable {
    @Override
    public void run() {
    for (int i=0;i<=100;i++){
        if (i%2==1){
            System.out.println("odd no ." + i);
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    }
}
