package basics;

public class Loops { //for(samij populjarnij), while, do while - cikli
    public static void main(String[] args) { //dry principle - dont repeat yourself


        //FOR LOOP (ispoljzuetsja kogda mi znaem skoljko budet ciklov)
        for(int i =0; i < 10; i++){
            System.out.println("Hello World!");

        }

        for(int i = 1; i <= 10; i++){
            System.out.print(i + " "); //vse v odnu strochku

        }

        System.out.println();

        for(int i = 1; i <= 10; i += 2){
            System.out.print(i + " "); //vse v odnu strochku

        }

        //WHILE LOOP
        int i = 1;
        while(i <= 10){
            System.out.println("This is while loop" + i);
            i++;
        }

        //DO WHILE
        i = 1;
        do {
            System.out.println("This is while loop" + i);
            i++;
        }while (i <= 10);






    }


}
