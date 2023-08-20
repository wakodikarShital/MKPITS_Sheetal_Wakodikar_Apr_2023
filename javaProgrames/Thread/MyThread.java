public class MyThread extends Thread{

    MyThread(String name){
        super(name);
    }
        public void run(){
            System.out.println("Hello");
        }


    public static void main(String[] args) {
        System.out.println("hii");  // priority of main thread is maximum
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().getName()); // for main thread name



        MyThread myThread = new MyThread("Wakodikar");// its has less priority
        System.out.println(myThread.getName());

//        myThread.setName("Shital");
        myThread.start();



        System.out.println("bye");
//        System.out.println(myThread.getPriority()); //print priority
//        System.out.println(myThread.getName()); // for thread name


    }

    }



