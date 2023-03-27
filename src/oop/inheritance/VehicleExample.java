package oop.inheritance;

class Vehicle{
   protected String brand; //child class from parent class. all the fields should be protected and not private. if we create subclase from this class we use protected
    public void honk(){
        System.out.println("Tu tu");
        System.out.println("Brand: " + brand);
    }
}


class Bike extends Vehicle{
    public void honk(){ // we will change method from the parent class. we inheriting and replace it in another way
        System.out.println("Bip Bip"); //another noise then in parent class
        System.out.println("Brand: " + brand);
    }
}


public class VehicleExample {
    public static void main(String[] args) {
      Vehicle vehicle = new Vehicle();
      vehicle.brand = "Tesla";
      vehicle.honk();

      Bike bike = new Bike();
      bike.brand = "Cube";
      bike.honk();
    }
}
