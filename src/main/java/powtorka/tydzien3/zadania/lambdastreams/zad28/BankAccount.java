/*
Przygotuj klasę BankAccount posiadającą pola name and balance. Utwórz 7 instancji
klasy BankAccount ze stanem konta odpowiednio 1000,2000,3000,4000, 5000,7500 i
10000 złotych. Dodaj je do listy generycznej. Korzystając ze strumieni znajdź
wszystkie konta które mają zgromadzonych środków więcej niż 5000zł.
*/

package powtorka.tydzien3.zadania.lambdastreams.zad28;

public class BankAccount {

    private String name;
    private int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
