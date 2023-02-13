public class Operators {
    public static void main(String[] args) {
        //Basic arithmetic operators -, +, *, /, %
        int x = 100;
        x = x + 10;
        System.out.println(x);

        int a = 100;
        a = a % 75; //pojavljaetsja ostatok posle delenija ... 100/75 ...ostatok 25
        System.out.println(a);

        //Assigment operators =, -=, +=,  *=, /=
        int b = 10;
        b = 20;
        b += 20;
        System.out.println(b);


        //Incrementation operators & decrementation operators ++, --

        int i = 10;
        i++;
        ++i; //postincrementation . mozhno ispoljzovatj ++i;
        System.out.println(i);

        //Post - incrementation
        int num1 = 10;
        System.out.println(num1++);
        System.out.println(num1);

        //pre-incrementation
        int num2 = 10;
        System.out.println(++num2);
        System.out.println(num2);


        // 4 ways to increment by one
        num1 = num1 + 1;
        num1 += 1;
        num1++;
        ++num1;

        //Relational operators
        //Equality ==
        int p = 10;
        int k = 10;
        System.out.println("Equality " + (p==k));

        //Inequality !=
        System.out.println("Inequality " + (p!=k));

        //Greater than > and greater than or equal to >=
        System.out.println("Greater than " + (p>k));
        System.out.println("Greater than or equal to " + (p>=k));

        //Less than < and Less than or equal to <=
        System.out.println("Less than " + (p<k));
        System.out.println("Less than or equal to " + (p<=k));

        //Logical operators
        //Logical AND (Conjunction) &&

        boolean sun = true;
        boolean dry = true;

        System.out.println("I will go outside " + (sun && dry));

        System.out.println((p>k) && (p>=k));

        int bobsAge = 8;
        int johnAge = 9;
        int annasAge = 10;

        //is john older then bob and younger then anna
        System.out.println((johnAge > bobsAge) && (johnAge < annasAge));

        // Logical OR - ||

        boolean sale = true;
        boolean rich = true;

        System.out.println("I will buy iPhone " + (sale || rich));

        //negation
        boolean example = true;
        System.out.println(!example);







    }


}
