import java.util.Scanner;

public class PerDayOfDoctorEarning {
    public static void main(String[] args) {
       int feesForBelowAgeOf_17 = 300;
       int feesForBetweenAgeOf17_To_40 = 400;
       int feesForAgeAbove_40 =300;
       int totalFeesOfTheDay=0;

       int[] age=new int[20];
        Scanner scanner = new Scanner(System.in);


        for (int counter=0;counter<age.length;counter++){
            System.out.println("Enter age for patient "+counter+ " = ");
            age[counter]=scanner.nextInt();
            if (age[counter]<=17){
                totalFeesOfTheDay=totalFeesOfTheDay+feesForBelowAgeOf_17;
            }if (age[counter]>=17 && age[counter]<=40){
                totalFeesOfTheDay=totalFeesOfTheDay+feesForBetweenAgeOf17_To_40;
            }if (age[counter]>40){
                totalFeesOfTheDay=totalFeesOfTheDay+feesForAgeAbove_40;
            }
        }

        System.out.println("Total earning of the day = "+totalFeesOfTheDay);

//        for (int value:age){
//            System.out.println(value);
//        }
    }
}