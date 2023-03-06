package homeworks;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        //what is max amount of jam ...7*6 = 42 kg max amount he can take
        //if ask bring 37 kg - 35kg ...5 jars * 7 and 2 jars per 1 kg ....not possible bacause can take only 6 jars
        //39 ...not possible
        //36 possible 5 * 7 and 1 jar 1 kg
        //32 - not possible

        //use not so popular math operators



        /*      Alex is an owner of grocery store. Among many products he sells,
        he's mostly famous for his hand-made jam, that is being
        sold in jars of 1kg or 7kg. Alex sells only full jars
        (i.e. it's only possible to buy the whole jar of 1kg, or 7kg).

        Will is asked by his wife Jane to buy some amount of Alex's jam.
        Will forgot to take his bag, thus he can take home no more than six jars of jam
        (three jars in each of his two hands). Jane is very serious about the
        shopping list - if she asked for specific amount of jam, she expects exactly this
        amount, no more, no less.

        Write an application that will check if Will is able to take home the
        amount of jam specified by Jane. Amount of jam should be read from user
        (positive int value). You can assume that there's always enough jam in Alex's shop.
        Your application should print true or false.*/

        Scanner scanner = new Scanner(System.in);

        int amountOfJam = scanner.nextInt();

        int amountOf7KgJars = amountOfJam / 7;
        System.out.println("amountOf7KgJars = " + amountOf7KgJars);

        int amountOf1KgJars = amountOfJam % 7;
        System.out.println("amountOf1KgJars = " + amountOf1KgJars);

        System.out.println(amountOf7KgJars + amountOf1KgJars <=6);


    }
}

