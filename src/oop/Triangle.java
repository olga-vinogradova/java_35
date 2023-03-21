package oop;

public class Triangle {

    //Fields
    private double side1;
    private double side2;
    private double side3;

    //Setter methods
    public void setSide1(double side1){ //good approach to use the same name "side 1" .... first "side 1" is field of the class - second "side 2" input from the method
        this.side1 = side1;
}
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }
    //Getter method
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    //Validation method
    private boolean isValid(double side1,double side2, double side3) { //(double s1, double s2, double s3)
         return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
//Calculate area
    public double areaTriangle() {
        double area = 0;
        if (isValid(side1,side2,side3)){
            double halfPer = (side1+side2+side3) / 2;
            area = Math.sqrt(halfPer * (halfPer - side1) * (halfPer - side2) * (halfPer - side3));
        }else {
            System.out.println("Triangle is not valid");
        }
        return area;
    }

}
