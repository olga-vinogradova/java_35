package basics;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        //Declaring array that will store 3 elements of type String
        String[] names = new String[3];

        //Access value nr. 1 from array
        System.out.println(names[0]); //schet nachinaetsha s nulja

        //Set element values using each element's index
        names[0] = "Ben";
        names[1] = "Tom";
        names[2] = "Bob";

        //Access value nr. 1 from array
        System.out.println(names[0]); //schet nachinaetsha s nulja


        //Length
        System.out.println(names.length);

        //Second way - declare and initialize array at the same time
        String[] dreamCars = new String[]{"BMW", "Volvo", "Opel", "Mercedes"};

        //Length
        System.out.println(dreamCars.length);

        //Iterate through all elements in array with for loop

        for(int i = 0; i < dreamCars.length; i++){
            System.out.println((i+1) + ". " + dreamCars[i]);
        }

        //same idea but using For-each loop
        for(String car : dreamCars){
            System.out.println(car);
        }


        System.out.println(Arrays.toString(dreamCars));


        //We have an array of some amount int values
        //We need to give a comment for every element in the array
        //If the value is odd or even --even chetnie; odd nechetnie

        int listOfNumbers[] = {2342,86,97,8,675,98,6,43};

        //To loop through all elements let's use for-each loop
        for(int number : listOfNumbers){
           if(number % 2 ==0){
               System.out.println(number + " even number");
           }else {
               System.out.println(number + " odd number");
           }
        }



    }
}
