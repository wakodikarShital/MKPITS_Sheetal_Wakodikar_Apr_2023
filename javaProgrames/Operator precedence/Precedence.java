public class Precedence {
    public int prefixAndSuffixPrecedence(){
        int a=10,b=5,c=1,result;
        /**
         * When dealing with multiple operators and operands in a single expression,
         * you can use parentheses like in the below example  for clarity .
         * example = a-++c-++b when we use parentheses like that a-(++c)-(++b)
         * so , firstly solve parentheses here (++c) so, c=1 its a prefix increment firstly increment and assign value
         * c=2 and same here for the (++b) b=6
         * a=10,c=2,b=6  (a-c-b) = 10-2-6
         * result of precedence is 2
         */
        result=a-++c-++b;
        System.out.println("Result Of Precedence is = "+result);
        return result;
    }
}
