package homeworks;

import java.util.Arrays;

public class HW10 {
    public static void main(String[] args) {

        //take first and last element and swap places...take second from the beginning & from the end.


        int[] myArray = {1, 2, 3, 4, 5, 6, 20, 7, 8, 9, 10, 11, 12};
        System.out.println("Original array: " + Arrays.toString(myArray));
        int[] originalArrayCopy = new int[myArray.length];

        for (int i = 0; i < myArray.length/2; i++) {
            originalArrayCopy[i] = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = originalArrayCopy[i];
        }

        System.out.println("Reverse array: " + Arrays.toString(myArray));


        /*2nd variant
        int[] myArray = {1, 2, 3, 4, 5, 6, 20, 7, 8, 9, 10, 11, 12};
        System.out.println("Original array: " + Arrays.toString(myArray));

        for (int i = 0; i < myArray.length/2; i++) {

            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        System.out.println("Reverse array: " + Arrays.toString(myArray));
         */

    }
}