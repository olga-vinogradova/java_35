package oop.inner;

class OuterClass{ //in real life outer class - we build a factory and inner class we built a cars. we can not start with cars if we do not have factory.
    int num = 10;
    class InnerClass{ //nested class or inner class. is inside of other class
        int num = 5;
    }
}


public class NestedClasses {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass(); //object based on Outerclass
        System.out.println("Outer class value: " + outerClass.num);

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println("Inner class value: " + innerClass.num);
    }
}
