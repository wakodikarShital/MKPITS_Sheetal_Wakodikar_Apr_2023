public class ArrayException {
    public static void main(String[] args) {
        int num[]={0,1,2,3,4,5};

            try {
                for (int i=0;i<7;i++) {
                    System.out.println(num[i]);
                }
            }catch (IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Array length is 6");
            }

    }
}
