package Initialize_Value_In_Object;

/**
 * As we also initialize value in object by reference variable
 */
public class ByReferenceVariable {
    String typeOfFlower;
    String colorOfFlower;

    public static void main(String[] args) {
        ByReferenceVariable flower = new ByReferenceVariable();
        flower.typeOfFlower="Rose";
        flower.colorOfFlower="Red";
        System.out.println(flower.typeOfFlower + " is " + flower.colorOfFlower);
    }
}
