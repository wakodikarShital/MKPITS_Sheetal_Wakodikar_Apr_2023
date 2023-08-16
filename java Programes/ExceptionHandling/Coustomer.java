public class Coustomer {
    public void displayAge(int age) throws UserDefineException{
        if(age<0 || age>100)
            throw new UserDefineException();
        System.out.println("Age = " + age);

    }

    public static void main(String[] args) {
        Coustomer coustomer = new Coustomer();
        try {
            coustomer.displayAge(121);
        }catch (Exception e){
            System.out.println( e.getMessage());
        }

    }
}
