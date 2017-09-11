package D045_11_09.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Miver on 2017-09-11.
 */
public class EmployeePlaygroundTest {
    @Test
    public void getEmployeesWithSalary() throws Exception {
        EmployeePlayground playground = new EmployeePlayground();
        List<Employee> employeesWithSalary = playground.getEmployeesWithSalary(2000);
        employeesWithSalary.forEach(System.out::println);
    }

    @Test
    public void streamsTest() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Piotr", "Kowal", 20, 2500));
        employees.add(new Employee("Piotr", "Nowak", 25, 3500));
        employees.add(new Employee("Piotr", "Adamiak", 23, 2700));

        Stream<Employee> employeeStream = employees.stream().filter(x -> x.getSalary() > 2600);

        employees.add(new Employee("Jan", "Testowy", 23, 5000));

        Stream<Employee> employeeStream1 = employeeStream.filter(x -> x.getSalary() < 4500);

        List<Employee> result = employeeStream1.collect(Collectors.toList());
        System.out.println(result.size());

        InterfaceWithDefaultMethods def = () -> System.out.println("OK");
    }
}
