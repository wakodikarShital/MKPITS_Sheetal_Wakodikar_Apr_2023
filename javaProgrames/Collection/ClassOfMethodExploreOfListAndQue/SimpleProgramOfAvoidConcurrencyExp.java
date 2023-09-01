package ClassOfMethodExploreOfListAndQue;

import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class SimpleProgramOfAvoidConcurrencyExp extends Thread{
    ArrayList arrayList = new ArrayList<>();

    @Override
    public void run() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

    }

    public static void main(String[] args) {
        Main t = new Main();
        

    }
}
