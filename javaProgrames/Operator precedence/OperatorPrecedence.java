public class OperatorPrecedence {
    public static void main(String[] args) {
        int m=10 , n=10;
        /**
         * Here take int variable of m = 10 and n=10
         */
        int answer= m++ / (++n * n--) / m-- ;
        System.out.println(answer);

        int result = ++m;
        System.out.println("Result = "+result);
    }
}