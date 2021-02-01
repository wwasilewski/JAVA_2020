package powtorka.tydzien3.zadania.generics.zad14;

public class Main {
    public static void main(String[] args) {
        Clipboard<Employee> employeeClipboard = new Clipboard<>();
        employeeClipboard.insertIntoClipboard(new Employee("Tom", "Jones", "IBM"));

        Clipboard<Teacher> teacherClipboard = new Clipboard<>();
        teacherClipboard.insertIntoClipboard(new Teacher("Tom", "Jones", "UJ", "mgr"));

        System.out.println(employeeClipboard.getFromClipboard().getCompanyName());
        System.out.println(teacherClipboard.getFromClipboard().getDegree());
    }
}
