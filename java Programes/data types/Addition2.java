class Addition{
	
	
	int addinteger(int number1 ,int number2){
	return (number1+number2);
	
}
}
class Addition2{
	public static void main(String[]args){
		Addition addition = new Addition();
		int sum = addition.addinteger(10,20);
		System.out.println(sum);
	}
}