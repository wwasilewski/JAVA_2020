/*
Wykorzystując przygotowaną listę z poprzedniego zadania za pomocą strumieni
znajdź konto, które ma najwięcej zgromadzonych środków.
*/

package powtorka.tydzien3.zadania.lambdastreams.zad29;

import powtorka.tydzien3.zadania.lambdastreams.zad28.BankAccount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Zad29 {
    public static void main(String[] args) {
        List<BankAccount> listOfAccounts = new ArrayList<>();

        listOfAccounts.add(new BankAccount("Tom", 1000));
        listOfAccounts.add(new BankAccount("Ann", 2000));
        listOfAccounts.add(new BankAccount("Jack", 3000));
        listOfAccounts.add(new BankAccount("Bob", 4000));
        listOfAccounts.add(new BankAccount("Mary", 5000));
        listOfAccounts.add(new BankAccount("Ross", 7500));
        listOfAccounts.add(new BankAccount("Me", 10000));

        listOfAccounts.stream()
                .max(Comparator.comparing(BankAccount::getBalance))
                .ifPresent(b -> System.out.println("biggest balance: " + b.getBalance()));
    }
}
