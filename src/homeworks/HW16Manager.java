package homeworks;

public class HW16Manager extends HW16Member { //subclass

    String department; //additional field

    public HW16Manager(String name, int age, String phoneNumber, String address, int salary, String department){ //custom constructor
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

}
