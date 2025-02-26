package Dag3;

public class FlowerShop {

    public static void main(String[] args) {
        welcomeMessage();
        registerFlower();

    }
    public static void welcomeMessage(){
        System.out.println("WELCOME TO OUR FLOWER SHOP!!!!");

    }

    public static void registerFlower(){
        Flower flower = new Flower("Rose", "Red", 21.2, 20);
        Flower flower2 = new Flower("Rose", "Red", 21.2, 20);
        Flower flower3 = new Flower("viola", "Blå", 25.5, 30);

        flower.displayInfo();
        flower2.displayInfo();
        flower3.displayInfo();
        System.out.println(flower.toString());
        System.out.println(flower2.toString());

        System.out.println("Lets see if they are the same " + flower.equals(flower2));
        System.out.println("Lets see if they are the same " + flower.equals(flower3));

    }

}
