class Short3{
short addshort(short short1 ,short short2){
	return (short1+short2);

}
}



class Short4{
public static void main(String[]args){
	Short3 short3= new Short3();
		short sum = short3.addshort(5,4);
		System.out.println(sum);
}
}
