class Vehicle{
	String typesOfVehicles;
	int noOfVehicles;
}
class Van extends Vehicle{
String typesOfVan;
double size;
}
class TransportationVan extends Van{
double  noOfSeats;
int noOfDoors;
int noOfWheels;
float fuel;

}
class DeliveryVan extends TransportationVan{
double noOfSpace;
double noOfBoxes;
double speed;
}