package gangoffour.creational.prototype.viaconstructor;

public class Employee {

    public String name;
    public Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Employee(Employee other) {
        name = other.name;
        address = new Address(other.address);
    }

    @Override
    public String toString() {
        return "Employee {" + " name= " + name + ", address= " + address + '}';
    }
}
