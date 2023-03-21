package oop;

import java.util.Scanner;

public class CallingTriangleClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of side 1");
        double side1 = scanner.nextDouble();

        System.out.println("Please enter size of side 2");
        double side2 = scanner.nextDouble();

        System.out.println("Please enter size of side 3");
        double side3 = scanner.nextDouble();

        Triangle triangle1 = new Triangle();
        triangle1.setSide1(side1); //using here our setter methods from the Triangle class
        triangle1.setSide2(side2);
        triangle1.setSide3(side3);

        double result = triangle1.areaTriangle();
        System.out.println("result = " + result);
    }
}
