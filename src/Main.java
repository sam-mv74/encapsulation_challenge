public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ali", 20, "9092301202", "Iran Tehran", 100000);
        employee.printSalary();
        Manager manager = new Manager("Reza", 30, "9092304534", "Iran Tehran", 200000);
        manager.printSalary();
    }
}
class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private int salary;
    public Member(String name, int age, String phoneNumber, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println(this.salary);
    }
}
class Employee extends Member {
    private String specialization;
    private String department;
    public Employee(String name, int age, String phoneNumber, String address, int salary) {
        super(name, age, phoneNumber, address, salary);
    }
}
class Manager extends Member {
    private String specialization;
    private String department;
    public Manager(String name, int age, String phoneNumber, String address, int salary) {
        super(name, age, phoneNumber, address, salary);
    }
}
