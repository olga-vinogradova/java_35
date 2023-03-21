package oop;

import java.util.Scanner;

public class Methods { //class
    public static void main(String[] args) { //main method

        //public access modifier - where our method would be available
        //static - could be there or not. is needed if we want to be able to call method without creating a new object
        Scanner scanner = new Scanner(System.in); //what related to "printName" method we put into the main method
        System.out.println("Please enter your name");
        String usersName = scanner.nextLine();
        //System.out.println(usersName);
        System.out.println("Please enter your age");
        int usersAge = scanner.nextInt();
        printName(usersName, usersAge);//calling a "printName" method that is below
        printName("Bob",50); //passing input paramethers

        greetings(usersName); //took string value and return it. we can use in the main method. we can use it. in void we can not use it - only print for example.
        String answer2 = greetings(usersName);
        System.out.println(answer2);

        //sum method usage in main method
        System.out.println(sum(75,12,5));



    }
    //we need to write our methods after the main method
    public static void printName(String name, int age){ //printName - name of a method . String name - input argument. use following order as is written - firsly name, then age. not return something.
        System.out.println("Hello your name is " + name);
        System.out.println("You are " + age + " years old");
    }

    public static String greetings(String name){ //not include void -> thats why we should include return
        String result = "Hi " + name;
        return result;    //method return smt because the word "return" is obligatory
    }

    public static int sum (int num1, int num2, int num3){
        return num1+num2+num3;
    }

}
