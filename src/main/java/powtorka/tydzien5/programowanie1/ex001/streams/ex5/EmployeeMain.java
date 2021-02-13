/*
Utwórz klasę pracownik posiadającą imię, nazwisko i wynagrodzenie. Dodaj 10
pracowników do kolekcji ArrayList. Korzystając ze strumieni znajdź średnie
wynagrodzenie pracownika, a następnie korzystając ze strumieni wyświetl wszystkich
pracowników zarabiających więcej niż średnia.
*/

package powtorka.tydzien5.programowanie1.ex001.streams.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jon", "Snow", 4000));
        employees.add(new Employee("Don", "Sniw", 5000));
        employees.add(new Employee("Eon", "Snuw", 2000));
        employees.add(new Employee("Con", "Snew", 1400));
        employees.add(new Employee("Gon", "Snyw", 7000));
        employees.add(new Employee("Lon", "Snol", 12000));
        employees.add(new Employee("Kon", "Snos", 2000));
        employees.add(new Employee("Zon", "Snox", 8000));
        employees.add(new Employee("Won", "Snoh", 17000));
        employees.add(new Employee("Wojciech", "W", 60000));

        Double avgSalary = employees.stream()
                .collect(Collectors.averagingInt(value -> value.getSalary()));
        System.out.println("average salary: " + avgSalary);

        employees.stream()
                .filter(employee -> employee.getSalary() > avgSalary)
                .forEach(employee -> System.out.println(employee.getFirstname() + " "
                        + employee.getSurname() + " " + employee.getSalary()));
    }
}
