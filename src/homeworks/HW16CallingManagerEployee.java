package homeworks;

public class HW16CallingManagerEployee {

    public static void main(String[] args) {

        HW16Employee employee = new HW16Employee("Bob",30,"+37129453209","Brivibas",1000,"Worker"); //objects
        HW16Manager manager = new HW16Manager("Sam",50, "+37120854098","Valdemara",3000,"Sales");

        employee.printSalary(); //calling salary method
        manager.printSalary();
    }
}
