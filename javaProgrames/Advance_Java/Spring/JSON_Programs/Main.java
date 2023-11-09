public class Main {

    public static void main(String[] args) {

    JSON_Programs jsonPrograms = new JSON_Programs();
    jsonPrograms.Json_Example1();
        System.out.println("----------------------- encode----------------------------");
        jsonPrograms.encode();
        System.out.println("----------------------- decode----------------------------");
        jsonPrograms.decode();
    }

}