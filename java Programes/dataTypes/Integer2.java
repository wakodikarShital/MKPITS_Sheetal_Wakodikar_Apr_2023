class Float1{
int addfloat(float float1 ,float float2){
	return (float1+float2);

}
}



class Float{
public static void main(String[]args){
	Float1 float1 = new Float1;
		float sum = float1.addfloat(2,2);
		System.out.println(sum);
}
}
