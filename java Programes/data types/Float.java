class Short3{
Short addshort(short short1 ,short short2){
	return (short1+short2);

}
}



class Short{
public static void main(String[]args){
	Short3 short3= new Short3();
		short sum = short3.addfloat(4,4);
		System.out.println(sum);
}
}
