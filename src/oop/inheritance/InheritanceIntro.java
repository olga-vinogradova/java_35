package oop.inheritance;

class Parent{ //superclass or parent class
    public void printParent(){ //usually in separate file
        System.out.println("This is parent class");
    }
}

class Child extends Parent{ //subclass or child class. all the fields all the methods from the parent class goes to the child class
public void printChild(){
    System.out.println("This is child class");
}
}

public class InheritanceIntro {
    public static void main(String[] args) {
        Parent parent = new Parent();//create object of parent class
        parent.printParent();

        Child child = new Child();//create object of child class
        child.printParent();
        child.printChild();

    }

}
