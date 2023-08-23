import java.time.Month;
import java.util.Scanner;

public class EnumeratorClass {

    // enum decale within a class
    //out of the class
    // enum not decaler in method
    enum Months{JANUARY(31),FEBRUARY(28), MARCH(31),APRIL(30),MAY(31);
        int value;

        // create a constructor of enum
        Months(int value){
            this.value=value;

        }
    }
    public static void main(String[] args) {
        for ( Months m:Months.values()){
            System.out.println(m);
        }

        Months m=Months.JANUARY;

        switch (m){
            case JANUARY:
                 m=Months.JANUARY;
                System.out.println(m.value + "days comes in "  + m +  " month "+ " indexing on " +  m.ordinal() );
                System.out.println("31 days");
                break;
            case FEBRUARY:
                System.out.println("28 days");
                break;
            case APRIL:

                System.out.println("31 days");
                break;
            case MAY:
                System.out.println("31 days");

        }



    }


}
