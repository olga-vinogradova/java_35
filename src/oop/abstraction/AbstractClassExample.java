package oop.abstraction;

abstract class Animal{ //abstract class
    protected String name;
    //Regular method
    public void sleep(){
        System.out.println("ZZZZ");
    }
    public abstract void animalSound(); //abstract method
}

class Pig extends Animal{
    @Override
    public void animalSound() { //obligatory must be included
        System.out.println("oink oink");
    }
}


public class AbstractClassExample {
    public static void main(String[] args) {

        //Cannot create direct class object from abstract class
        //Animal animal1 = new Animal(); //animal class object

Pig pig = new Pig();
pig.sleep();
pig.animalSound();

    }
}
