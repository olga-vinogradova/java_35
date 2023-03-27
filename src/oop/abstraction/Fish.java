package oop.abstraction;

public class Fish extends Pet{

    //added additional feature - field
    private int waterChangeInWeek; //not protected because we will not do subclass.

    public Fish(String color, String eat, String place, int averageAge, int waterChangeInWeek){ //constractors are not enharritend
        super(color, eat, place, averageAge); //take from this. in Pet class(this.color = color)
        this.waterChangeInWeek = waterChangeInWeek;
    }
    @Override
    public void printPetInfo(){
        System.out.println("Color: " + color);
        System.out.println("Eat: " + eat);
        System.out.println("Place: " + place);
        System.out.println("Lifespan: " + averageAge);
        System.out.println("Water changes in a week: " + waterChangeInWeek);
    }
}
