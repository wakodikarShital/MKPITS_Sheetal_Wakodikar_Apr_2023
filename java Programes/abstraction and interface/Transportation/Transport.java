package Transportation;

abstract class Transport {
    abstract void typeOfVehical();
    abstract void numberOfWheels();
    abstract void colour();
    abstract void  numberOfDoors();
    public double size( double length , long breadth ,long height){
        return length*breadth*height;
    }
}
