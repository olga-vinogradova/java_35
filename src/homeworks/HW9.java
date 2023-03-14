package homeworks;

import java.util.Scanner;

public class HW9 {

    //user enter the tree size and the Christmas tree is printed out

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Input Christmas tree size");
        int treeSize = scanner.nextInt();

            for (int i = 1; i <= treeSize; i++){  //first for loop for the tree -> used for the new lines (println)
                for (int a = 1; a <= (treeSize-i);a++){ //first nested for loop for spaces (example 5-1 = 4)
                    System.out.print(" ");
                }
                for(int j = 1; j <= i; j++){ //second for loop for the stars
                    System.out.print("*");
                    if (j>1){ // additional star, starting from the second line. Each next line contains 2 more star symbols
                        System.out.print("*");
                    }
                }
                System.out.println();
            }

            for (int i = 1; i < treeSize; i++){ //second for loop for tree trunk -> used for spaces (if user enter 5 -> spaces amount would be 4)
                System.out.print(" ");
            }
        System.out.print("#"); //tree trunk one symbol
                }
            }







