package homeworks;

public class Vehicle {
    private float fuel;
    private float fuelUsage;
    private int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public float maxDistance(float fuel, float fuelUsage, int passengers){
        if (passengers > 0){
            fuelUsage = fuelUsage + (passengers * 5 * fuelUsage/100);
        }
        return fuel / fuelUsage * 100;
    }
    public float maxDistance(){
        if (passengers > 0){
            fuelUsage = fuelUsage + (passengers * 5 * fuelUsage/100);
        }
    return fuel / fuelUsage * 100;
    }
}
