class Double3{
double adddouble(double double1 ,double double2){
	return (double1+double2);

}
}



class Double1{
public static void main(String[]args){
	Double3 double3= new Double3();
		double sum = double3.adddouble( 2,1);
		System.out.println(sum);
}
}
