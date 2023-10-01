public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------Condition---------");
        AgeCondition ageCondition = new AgeCondition();
        ageCondition.condition();
        System.out.println("-------------------Input From User---------");
        NumberInputFromUser numberInputFromUser = new NumberInputFromUser();
        numberInputFromUser.getInputFromUser();

        System.out.println("--------------------Check if its even or not------------");
        CheckOddAndEven checkOddAndEven = new CheckOddAndEven();
        checkOddAndEven.oddAndEven();

        System.out.println("--------------------- if else if-----------------");
        IfElseIf_program ifElseIfProgram = new IfElseIf_program();
        ifElseIfProgram.checkCondition();


    }
}