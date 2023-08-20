package Apartment;

public class ApartmentMain implements Apartment,Buildings{

    @Override
    public void nameOfApartment() {
        System.out.println("Apartment A");
    }

    @Override
    public void heightOfBuilding() {
        System.out.println("Height of building 50 feet");

    }
    @Override
    public void numberOfBuildings(){
        System.out.println("Five buildings in the society");

    }

    @Override
    public void numberOfBalconies() {
        System.out.println("There have 2 balconies in each flat");
    }

    @Override
    public void numberOfFloors() {
        System.out.println("14 floors");
    }

    @Override
    public void numberOfLift() {
        System.out.println("There are 2 lift each building");
    }

    @Override
    public void numberOfRooms() {
        System.out.println("There are 2 or 3 rooms of each flat");
    }

    public static void main(String[] args) {
        ApartmentMain apartmentMain = new ApartmentMain();
        apartmentMain.nameOfApartment();
        apartmentMain.heightOfBuilding();
        apartmentMain.numberOfFloors();
        apartmentMain.numberOfBalconies();
        apartmentMain.numberOfRooms();
        apartmentMain.numberOfLift();
    }
}
