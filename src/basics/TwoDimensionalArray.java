package basics;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        //Declaring 2D array with 2 rows and 5 columns

        String[][] dreamCars = new String [2][5];

        dreamCars[0][0] = "Audi";
        dreamCars[0][1] = "BMW";
        dreamCars[0][2] = "Volvo";
        dreamCars[0][3] = "Tesla";
        dreamCars[0][4] = "Lexus";

        dreamCars[1][0] = "Fiat";
        dreamCars[1][1] = "Ferrari";
        dreamCars[1][2] = "Subaru";
        dreamCars[1][3] = "Saab";
        dreamCars[1][4] = "McLaren";

        //How many rows?
        System.out.println(dreamCars.length);

        //How many columns are in the one row?
        System.out.println(dreamCars[0].length);

        for (int i = 0; i < dreamCars.length; i++){

            for (int j = 0; j < dreamCars[i].length; j++){ //nested loop
                System.out.print(dreamCars[i][j] + " ");
            }
            System.out.println();
        }

        //Same thing using nested For each loops
        for(String [] rows: dreamCars){
            //System.out.println(Arrays.toString(rows));
            for (String car: rows){
                System.out.print(car + " ");
            }
            System.out.println();

        }



    }
}
