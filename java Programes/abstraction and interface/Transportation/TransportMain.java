package Transportation;

public class TransportMain {
    public static void main(String[] args) {
        DeliveryVan deliveryVan = new DeliveryVan();
        System.out.println(deliveryVan.size(32,8,8));
        deliveryVan.colour();
        deliveryVan.numberOfDoors();
        deliveryVan.numberOfWheels();
        deliveryVan.typeOfVehical();
    }
}
