/*
Przygotuj klasę osoba z polami imię, nazwisko, PESEL oraz nadpisz (@override)
metodę .toString() tak aby wyświetlała dane osoby w formacie "Imie: %s, Nazwisko:
%s, PESEL: %s". Utwórz instancję klasy osoba, wypełnij przykładowymi danymi oraz
wyświetl dane osoby korzystając z przygotowanej metody toString().
*/

package powtorka.tydzien5.programowanie1.ex001.general.ex4;

public class Person {
    private String firstname;
    private String lastname;
    private String pesel;

    public Person(String firstname, String lastname, String PESEL) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.pesel = PESEL;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return String.format("firstname: %s, lastname: %s, pesel: %s", firstname, lastname, pesel);
    }
}
