package Dag3;

import java.sql.SQLOutput;

public class Flower {
    private String name;
    private String colour;
    private double price;
    private int quantity;
    private String type;



    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getColour(){
        return colour;
    }
    public void setColour(){
        this.colour = colour;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(){

        if(price <0){
            this.price = price;

        } else {
            System.out.println("That dosent work");
        }

    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(){
        if(quantity <0){
            this.quantity = quantity;

        } else {
            System.out.println("That dosent work");
        }
        this.quantity = quantity;
    }
    public Flower(String name, String colour, double price, int quantity) {
        this.name = name;
        this.colour = colour;
        this.price = price;
        this.quantity = quantity;
    }

    public Flower(){
        this.name = "Dorte";
        this.colour = "RødGrødMedFløde";
        this.price = 21.2;
        this.quantity = 20;

    }

    public Flower(String name, String colour){
        this.name = name;
        this.colour = colour;
        this.price = 23.2;
        this.quantity = 21;
    }

    public boolean equals(){

    }

    public String toString() {
        return "Flower " + name + ":" + "\n" + "colour " + colour + "\n" + "Price " + price + "\n"
                + "Quantity" + quantity + "\n";
    }

    public void displayInfo() {
        System.out.println("Flower " + name);
        System.out.println("colour " + colour);
        System.out.println("price " + price);
        System.out.println("quantity " + quantity);
        System.out.println("-----------------------");
    }
}


