class Mul{
public static void main(String[]args){
Mul1 mul1 = new Mul1();
int answer = mul1.mulinteger(2,2);
System.out.println(answer);
}
}
class Mul1{
int mulinteger(int number1 ,int number2){
return(number1*number2);
}
}