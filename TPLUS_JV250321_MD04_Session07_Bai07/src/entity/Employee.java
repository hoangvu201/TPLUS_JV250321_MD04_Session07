package entity;

public class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee () {
    }

    public Employee (String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public double getSalary () {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    public void increaseSalary (double amount) {
        this.salary += amount;
    }

    public String toString () {
        return String.format("Name: %8s, ID: %5s, Salary: %,8.1f", name, id, salary);
    }
}