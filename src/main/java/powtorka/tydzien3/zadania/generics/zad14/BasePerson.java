/*
Przygotuj klasę BasePerson posiadającą pola name oraz surname, klasę Employee
dziedziczącą z klasy BasePerson posiadającą pole companyName, klasę Teacher
dziedziczącą z klasy BasePerson posiadającą pole school, degree. Wykorzystaj
klasę Clipboard z poprzedniego zadania, ale zmodyfikuj ją tak, aby przyjmowała
klasę BasePerson oraz jej wszystkie klasy potomne.
*/

package powtorka.tydzien3.zadania.generics.zad14;

public class BasePerson {
    private String name, surname;

    public BasePerson(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
