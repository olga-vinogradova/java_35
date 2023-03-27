package oop;

public class Animal {
    //Fields
    private String type; //better always to use private
    private int avgLifespan;
    private double weight;

    //Constructor (has no return type, no void)
    public Animal (String type, int avgLifespan, double weight){   //name of constructor should be same as name of the class. always would be public.
        this.type = type;
        this.avgLifespan = avgLifespan;
        this.weight = weight;
    }
    public Animal(String type, int avgLifespan){
        this.type = type;
        this.avgLifespan = avgLifespan;
    }
    public Animal(){

    }



    public void printAnimalInfo(){
        System.out.println("Type: " + type);
        System.out.println("Average lifespan: " + avgLifespan);
        System.out.println("Weight: " + weight);
    }




}
