package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        //Add elements
        names.add("Bob");
        names.add("Anna");
        names.add("Liam");

        //Print out all elements
        System.out.println(names);

        //remove element (no indexes here)
        names.remove ("Bob");
        System.out.println(names);

        //Size
        System.out.println(names.size());

        //Contains (search for an element)
        System.out.println(names.contains("Liam"));
        System.out.println(names.contains("Bob"));

        //Iterate
        for(String str:names){
            System.out.println(str);
        }

        //Example 2

        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println("intSet1: " + intSet1);


        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        System.out.println("intSet2: " + intSet2);

        //Find union

        HashSet<Integer> union = new HashSet<>(intSet1); //pass input data in constructor
        System.out.println("union before: " + union);
        union.addAll(intSet2);
        System.out.println("union after: " + union);

        //Find intersection (common elements)
        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("Intersection: " + intersection);

        //Find difference for IntSet1
        HashSet<Integer> difference1 = new HashSet<>(intSet1);
        difference1.removeAll(intSet2);
        System.out.println("Difference intSet1: " + difference1);

        //Find difference for IntSet2
        HashSet<Integer> difference2 = new HashSet<>(intSet2);
        difference2.removeAll(intSet1);
        System.out.println("Difference intSet2: " + difference2);

        //All differences
        HashSet<Integer> diffAll = new HashSet<>(difference1);
        diffAll.addAll(difference2);
        System.out.println("All differences: " + diffAll);

        //LinkedHashSet -> holds the order. can not use duplicates

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Estonia");
        linkedHashSet.add("Lithuania");
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Italy");

        System.out.println(linkedHashSet);
        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);


    }

}
