package klu.spring_DI;

public class Employee {

    private int id;
    private String name;
    private Address address;   // HAS-A relationship

    // Constructor Injection
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Setter Injection for Address
    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        address.displayAddress();
    }
}
