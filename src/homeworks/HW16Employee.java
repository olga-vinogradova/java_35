package homeworks;

public class HW16Employee extends HW16Member { //subclass

    String specialization; //additional field

    public HW16Employee(String name, int age, String phoneNumber, String address, int salary, String specialization){ //custom constructor
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

}
