class Long3{
long addlong(long long1 ,long long2){
	return(long1+long2);

}
}



class Long4{
public static void main(String[]args){
	Long3 long3= new Long3();
		long sum = long3.addlong(5,4);
		System.out.println(sum);
}
}
