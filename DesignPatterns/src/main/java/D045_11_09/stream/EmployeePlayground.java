package D045_11_09.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Miver on 2017-09-11.
 */
@Slf4j
public class EmployeePlayground {
    private List<Employee> employeeList = new ArrayList<>();

    public EmployeePlayground() {
        Employee first = new Employee("Piotr", "Kowalski", 20, 2500);
        Employee john = new Employee("Piotr", "Kowalski", 20, 2500);
        Employee tim = new Employee("Piotr", "Kowalski", 20, 2500);
        Employee jack = new Employee("Piotr", "Kowalski", 20, 2500);
        Employee red = new Employee("Piotr", "Kowalski", 20, 2500);
        Employee charming = new Employee("Piotr", "Kowalski", 20, 2500);
        Employee good = new Employee("Piotr", "Kowalski", 20, 2500);

        employeeList.add(first);
        employeeList.add(john);
        employeeList.add(tim);
        employeeList.add(jack);
        employeeList.add(red);
        employeeList.add(charming);
        employeeList.add(good);
    }

    public void printAll() {
        //sout (employee)
        employeeList.forEach(employee -> log.info(employee.toString()));

        //to jest to samo
//        employeeList.forEach(System.out::println);
//        employeeList.forEach(employee -> System.out.println(employee.getAge()));
//        for(Employee e : employeeList)
//            System.out.println(e.getAge());
    }

    public void printAllWithHighSalary() {
//        for (Employee emp : employeeList) {
//            if (emp.getSalary() > 2500)
//                System.out.println(emp);
//        }

        employeeList.forEach(emp -> {
            if (emp.getSalary() > 2500)
                System.out.println(emp);
        });
    }

    public void printNumber() {
//        int count = 0;
//        for (Employee emp : employeeList)
//            if (emp.getSalary() > 2500)
//                count++;
//        System.out.println("Zliczonych pracownikow: " + count);

        //raczej nie powinno sie tak robic
        final int[] count = {0};
        employeeList.forEach(emp -> {
            if (emp.getSalary() > 2500)
                count[0]++;
        });
        System.out.println(count[0]);
    }

    public long streamsFilter() {
        long count = employeeList.stream().filter(emp -> emp.getSalary() > 2500).count();
        return count;
    }

    public List<Employee> getEmployeesWithSalary(double salary) {
        List<Employee> result = employeeList.stream()
                .filter(employee -> employee.getSalary()>salary)
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        return result;
    }
}
