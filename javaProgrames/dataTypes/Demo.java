class Demo{
public static void main(String[]args){
Demo2 demo2 = new Demo2();
int answer =demo2.addinteger(2,2);
System.out.println(answer);
Demo3 demo3 = new Demo3();
int sum =demo3.mulinteger(2,2);
System.out.println(sum);
}
}





class Demo2{
int addinteger(int number1,int number2){
return(number1+number2);
}
}
class Demo3{
int mulinteger(int number1,int number2){
return(number1*number2);
}
}