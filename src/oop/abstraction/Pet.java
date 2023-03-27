package oop.abstraction;

public abstract class Pet {
//4 protected fields
    protected String color; //we create subclass from this class, so we use protected
    protected String eat;
    protected String place;
    protected int averageAge;

//custom constructor
    public Pet(String color, String eat, String place, int averageAge){
        this.color = color;
        this.eat = eat;
        this.place = place;
        this.averageAge = averageAge;

    }
public abstract void printPetInfo(); //abstract method
}
