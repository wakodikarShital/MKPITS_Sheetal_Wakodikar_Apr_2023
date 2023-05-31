class Byte3{
byte addbyte(byte byte1 ,byte byte2){
	return (byte1+byte2);

}
}



class Byte1{
public static void main(String[]args){
	Byte3 byte3= new Byte3();
		byte sum = byte3.addbyte( 2,1);
		System.out.println(sum);
}
}
