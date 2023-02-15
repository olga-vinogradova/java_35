package basics;

public class MathClass {
    public static void main(String[] args) {

        float num = 5.6f;
        System.out.println(num);

        //Rounding down (okruglenie)
        System.out.println("Floor: " + Math.floor(num)); //method

        //Rounding up
        System.out.println("Ceil: " + Math.ceil(num));

        //Rounding according to Math rule
        System.out.println("Round: " + Math.round(num));

        //ABS - absolute value
        System.out.println("ABS: "+ Math.abs(num));

        //Power
        System.out.println("Power " + Math.pow(2,3)); //2*2*2 = 8

        //Max
        System.out.println("Max " + Math.max(num,1.2f));

        //Min
        System.out.println("Min " + Math.min(num, 1.2f));

        //Max out of 3 values
        System.out.println("Max out of 3 " + Math.max(Math.max(14,19), 10));

        //SQRT - kvadratnij korenj squer root
        System.out.println("SQRT: " + Math.sqrt(4));

        //Random
        System.out.println("Random " + Math.random()); //... odno chislo ot 0.0 do 0.99999999
        System.out.println("Random (o-9) " + (int)(Math.random() * 10)); //odno celoe chislo ot 0 do 9
        System.out.println("Random (0-10) " + (int)(Math.random() * 11)); //odno celoe chislo ot 0 do 10
        System.out.println("Random (1-10) " + ((int)(Math.random() * 10) + 1)); //odno celoe chislo ot 1 do 10












    }

}
