package Initialize_Value_In_Object;

public class By_Using_Method {
    String house;
    int numberOfRooms;
    void typeOfHouse(String h,int rooms){
        house=h;
        numberOfRooms=rooms;

    }
    void displayProperties(){
        System.out.println(house+ " of romms " + numberOfRooms);
    }

}
