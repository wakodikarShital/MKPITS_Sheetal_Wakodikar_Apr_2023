package Calculator;

public class CalculateService {

    public void calculate(String operetor ,double operend1 ,double operend2 ){

        switch (operetor){

            case"+":
                CalculateAddition calculateAddition = new CalculateAddition();
                System.out.println(""+operend1+" + "+operend2+" = "+calculateAddition.getCalculateValue(operend1,operend2));
                break;

            case "-":
                CalculateSubstraction calculateSubstraction = new CalculateSubstraction();
                System.out.println(""+operend1+" - "+operend2+" = " +calculateSubstraction.getCalculateValue(operend1,operend2));

//               calculateSub.getCalculateValue(operend1,operend2);
                break;
            case "*":
                CalculateMultiplication calculateMultiplication = new CalculateMultiplication();
                System.out.println(""+operend1+" * "+operend2+" = " +calculateMultiplication.getCalculateValue(operend1,operend2));
//                calculateMul.getCalculateValue(operend1,operend2);
                break;
            case "/":
                CalculateDivision calculateDivision = new CalculateDivision();
                System.out.println(""+operend1+" is divided by "+operend2+" = " +calculateDivision.getCalculateValue(operend1,operend2));
//                calculateDiv.getCalculateValue(operend1,operend2);







        }
    }
}
