package homeworks;

public class HW14 {
    public static void main(String[] args) {
       //call discount method from here
        System.out.printf("Final price: %.2f",discount(89,20)); //using print formatting to round final price to two decimal places
    }

    //discount method
    public static float discount (float price, float discount){ //using word "static" because method would be called from this class, from main method
        return price - price * (discount/100); //final price
    }
}
