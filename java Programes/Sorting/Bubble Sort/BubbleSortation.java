class BubbleSortation{
    public static void main(String[]args){
        int num[] = {2,9,5,7,8};
        int ans=0;
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-i-1;j++){

                if(num[j] > num[j+1]){
                    ans=num[j+1];
                    num[j+1]=num[j];
                    num[j]=ans;





                }
            }
        }


        System.out.println("The sorted array is :");
        //bubbleSort(num);
        for(int k=0;k<5;k++){

            System.out.print( num[k] + " ") ;
        }





    }
}
