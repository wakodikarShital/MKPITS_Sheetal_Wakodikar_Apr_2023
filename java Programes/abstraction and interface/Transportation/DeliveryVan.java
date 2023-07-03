package Transportation;

public class DeliveryVan extends Transport {

    @Override
    void typeOfVehical(){
        System.out.println("It is a transport Vehicle");
    }
    @Override
    void numberOfWheels(){
        System.out.println("DeliveryVan have a four wheels");
    }

    @Override
     void colour(){
        System.out.println("colour is blue");
    }
    @Override
    void  numberOfDoors(){
        System.out.println("have a two doors");
    }


}
