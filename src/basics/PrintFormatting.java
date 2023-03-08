package basics;

public class PrintFormatting {
    public static void main(String[] args) {

        //s - String
        //d - integer
        //f - float/double
        //c - char
        //b - boolean

        String name = "Bob";
        int age = 34;

        System.out.println("Hello " + name + " your age is " + age);

        System.out.printf("Hello %s your age is %d\n",name, age); //souf .... "\n" - posle novaja stroka!!!

        double height = 192.2343636d;
        System.out.printf("%s is %.2f cm tall\n",name,height); //okrugljaem esli nado

        //Hello Bob your age is 34 and your height is 192... Good job Bob!  <---repeat a name twice
        System.out.printf("Hello %1$s your age is %2$d and your height is %3$.2f. Good job %1$s", name, age, height);

    }
}
