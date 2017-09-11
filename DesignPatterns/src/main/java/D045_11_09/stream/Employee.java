package D045_11_09.stream;

import java.io.Serializable;

/**
 * Created by Miver on 2017-09-11.
 */
public class Employee implements Serializable{
    private String name;
    private String sueName;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String sueName, int age, int salary) {
        this.name = name;
        this.sueName = sueName;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSueName() {
        return sueName;
    }

    public void setSueName(String sueName) {
        this.sueName = sueName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sueName='" + sueName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
