import java.io.File;

public class MyFile {
    public static void main(String[] args) {
        File file= new File("abc.txt");
        System.out.println(file.exists());// search in current folder
        System.out.println(file.getAbsoluteFile()); // provide the path
        File file1= new File("C:\\Users\\LENOVO\\IdeaProjects\\JavaInputOutput\\src","Main.java"); //chek the file is present or not
        System.out.println(file1.exists());
        File file2 = new File("C:\\Users\\LENOVO\\IdeaProjects\\JavaInputOutput\\src");
        System.out.println("Folder is present or not : "+file2.exists());
        File file3 = new File(file2,"Main.java");
        System.out.println(file3.exists());
        System.out.println("===============File List =======================");
        File file4 = new File("C:\\Users\\LENOVO\\IdeaProjects\\JavaInputOutput\\src");
        String [] fileList=file4.list();
        for(String fl:fileList){
            System.out.println(fl);
        }
        System.out.println("===============can execute the folder or not =======================");

        File file5 = new File("C:\\Users\\LENOVO\\IdeaProjects\\JavaInputOutput\\src\\Main.java");
        System.out.println(file5.canExecute());

        System.out.println("===============Compare to method =======================");
        File file6 = new File("Main.java");
        System.out.println( file6.compareTo(new File("C:\\Users\\LENOVO\\IdeaProjects\\JavaInputOutput\\src")));

        System.out.println("--------------------getName-------------------------");
        File file7 = new File("C:\\Users\\LENOVO\\IdeaProjects\\JavaInputOutput\\src");
        System.out.println(file7.getName());

        System.out.println("-------------------IsFile method----------------------");
        File file8 = new File("C:\\Users\\LENOVO\\IdeaProjects\\JavaInputOutput\\src\\MyFile.java");
        System.out.println(file8.isFile());

        System.out.println("------------------by list file method ------------------");
        File file9= new File("C:\\Users\\LENOVO\\IdeaProjects\\JavaInputOutput\\src");
        File fl[]=file9.listFiles();
        for(File fl1:fl){
            System.out.println(fl1);
        }

        System.out.println("----------------Last modified method---------------------");
        File file10 = new File("C:\\Users\\LENOVO\\IdeaProjects\\JavaInputOutput\\src\\MyFile.java");
        System.out.println(file10.lastModified());


        System.out.println("----------------Last modified method---------------------");
        File file11 = new File("C:\\Users\\LENOVO\\IdeaProjects\\JavaInputOutput\\src\\MyFile.java");
        System.out.println(file11.setLastModified(1000));

        System.out.println("-----------------Some file is make readable or not------------------------------");
        File file12 = new File("C:\\Users\\LENOVO\\IdeaProjects\\JavaInputOutput\\src\\MyFile.java");
        System.out.println(file12.setReadable(true));

        System.out.println("-----------------Some file is make Writable or not------------------------------");
        File file13 = new File("C:\\Users\\LENOVO\\IdeaProjects\\JavaInputOutput\\src\\MyFile.java");
        System.out.println(file13.setWritable(true));

        System.out.println("-----------------Some file is make Executable or not------------------------------");
        File file14 = new File("C:\\Users\\LENOVO\\IdeaProjects\\JavaInputOutput\\src\\MyFile.java");
        System.out.println(file14.setExecutable(true));















    }



}
