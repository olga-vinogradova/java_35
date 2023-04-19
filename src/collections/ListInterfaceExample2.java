package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {

        //Example1

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("List 1 = " + list1);

        ArrayList<Integer> list2 = new ArrayList<>(list1); //parametrized constructur
        //list2.addAll(list1); another scenarion as in prev line
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        System.out.println("List 2 = " + list2);

        //Example 2

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test 1");
        arrayList.add("Test 2");
        arrayList.add("Test 3");

        //For loop - looping through all elements 1 example
        for(int i = 0; i < arrayList.size();i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        //For-each -> looping through all elements 2 example
        for(String str: arrayList){
            System.out.println(str);
        }

        //LinkedList <- different collection extending List interface. common to ArrayList that is also inherriting List

        LinkedList<String> car = new LinkedList<>(); //String - what kind of values
        car.add("Audi");
        car.add("Opel");
        car.add("Toyota");
        System.out.println(car);

        //Last element
        System.out.println(car.get(car.size() -1));
        System.out.println(car.getLast()); //specific method

        //First element
        System.out.println(car.get(0));
        System.out.println(car.getFirst());

        //Create a new LinkedList object (Integer)
        //Populate the list with values from 1 to 100
        //Print all elements in the console

        LinkedList<Integer> listInteger = new LinkedList<>();
        for(int i = 1; i <= 100;i++){
            listInteger.add(i);
        }
        System.out.println(listInteger);


    }
}
