package powtorka.tydzien3.zadania.lambdastreams.zad28;

import java.util.ArrayList;
import java.util.List;

public class BankAccountMain {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new BankAccount("Tom", 1000));
        accounts.add(new BankAccount("Ann", 2000));
        accounts.add(new BankAccount("Jack", 3000));
        accounts.add(new BankAccount("Bob", 4000));
        accounts.add(new BankAccount("Mary", 5000));
        accounts.add(new BankAccount("Ross", 7500));
        accounts.add(new BankAccount("Me", 10000));

        accounts.stream()
                .filter(b -> b.getBalance() > 5000)
                .forEach(b -> System.out.println(b.getName() + ": " + b.getBalance()));
    }
}
