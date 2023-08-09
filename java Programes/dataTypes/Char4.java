class Char3{
char addchar(char char1 ,char char2){
	return (char1+char2);

}
}



class Char4{
public static void main(String[]args){
	Char3 char3= new Char3();
		char sum = char3.addchar(6,4);
		System.out.println(sum);
}
}
