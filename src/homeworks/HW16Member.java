package homeworks;

public abstract class HW16Member { //abstract class

    //5 fields
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected int salary;

    public HW16Member(String name, int age, String phoneNumber, String address, int salary){ //constructor
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary(){ //method
        System.out.printf("Salary for %s is %d \n",name,salary);
    };
}