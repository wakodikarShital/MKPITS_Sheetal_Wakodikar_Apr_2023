import java.lang.reflect.Executable;
import java.util.Date;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /** To check how many available core in Processor by Runtime.getRuntime().availableProcessors()
         * Runtime is class present in java.lang.Runtime package */
        int core = Runtime.getRuntime().availableProcessors();

        /**  */

        ExecutorService executorService = Executors.newFixedThreadPool(core);
       for(int i=0; i<100;i++){
           Future future=executorService.submit(new MyThread());
           System.out.println(new Date() + " " + future.get());
        }

    }
}