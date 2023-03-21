package oop;

public class Car { //we will not make a main method, because we will not execute it

    //Fields

    private String color; //not assign values. just general.
    private String brand;//encapsulation - putting here private
    private int maxSpeed;

    //3 Setter methods (Encapsulation). all the setter methods are void
    public void setColor(String color){ //could be different name instread of color
        this.color = color;
    }

    public void setBrand(String brand) { //start typing "set"
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed >= 30){ //making validation to clarify if this is a car
            this.maxSpeed = maxSpeed;
        }else{
            System.out.println("Invalid input");
        }
    }


    //3  Getter methods - for getting a method

    public String getColor() { //type "get"
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //Method
    public void printCarInfo(){ //do not need to use static word
        System.out.println("Car info: ");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Max speed: " + maxSpeed);
    }


}
