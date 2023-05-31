class Short3{
short addshort(short number1 ,short number2){
	return  (number1+number2);

}
}



class Short4{
public static void main(String[]args){
	Short3 short3= new Short3();
		short sum = short3.addshort(10,10);
		System.out.println(sum);
}
}
