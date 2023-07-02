class Society{
double area;
double length;
long bredth;

}
class Buildings extends Society{
int noOfBuildings;
long height;
String nameOfBuildings;
}
class Apartment extends Buildings{
int numberOfApartments;
int numberOfFloors;
double numberOfStairs;
int numberOfLift;
int flatNumber;
}
class BhkFlat extends Apartment{
long height;
long bredth;
double length;
int numberOfBalconies;
int numberOfDoors;
int numberOfRooms;

}
class Watchman extends Society{
int numberOfWatchman;
String uniformColour;
int shiftOfWatchman;

}