import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        List<Future<String>> futureList = new ArrayList<>();
        Callable<String> callable = new MyCallable();

        for(int i=0; i<100;i++){
            Future future=executorService.submit(callable);
            futureList.add(future);
        }

        for (Future future:futureList){
            System.out.println(future.get());
        }

    }
}
