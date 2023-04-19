package tasks.grocery;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in); //object ; use scanner here because we put scanner not only in main method, but in others too
    private static GroceryList groceryList = new GroceryList(); //class object; implement in case 1 below
    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) { //while loop - repeat unknown times

            System.out.println("Enter your choice");

            choice = scanner.nextInt();
            scanner.nextLine(); //fix line to prevent code to skip input. Console issue

            switch (choice){ //check what is the input
                case 0:
                    //print all options - what could be done in application
                    printInstructions(); //calling here static method.
                    break;
                case 1:
                    //print grocery list
                    groceryList.printGroceryList(); //object groceryList implemented in this class above + method from the GroceryList java class
                    break;
                case 2:
                    //add item
                    addItem();
                    break;
                case 3:
                    //modify item
                    break;
                case 4:
                    //remove item
                    break;
                case 5:
                    //search item
                    break;
                case 6:
                    //delete all items
                    break;
                case 7:
                    quit = true;
                    break;

            }

        }



    }

    private static void printInstructions(){
        System.out.println("\nPress"); // /n new line
        System.out.println("\t 0 - To print choice options"); // /t tab
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To delete all item in the list");
        System.out.println("\t 7 - To quit the application");}

    private static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

}
