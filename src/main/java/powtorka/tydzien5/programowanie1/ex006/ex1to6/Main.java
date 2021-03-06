/*
Do wspólnej listy dodaj kilka różnych pizz (po jednej z każdego rodzaju) i do każdej z
nich przekaż inne ciasto. Następnie korzystając z pętli for wyświetl sposób ich
wykonywania za pomocą metody preparePizza()
*/

package powtorka.tydzien5.programowanie1.ex006.ex1to6;

import powtorka.tydzien5.programowanie1.ex006.ex1to6.pizzadough.AllAmericanThin;
import powtorka.tydzien5.programowanie1.ex006.ex1to6.pizzadough.ChessyBites;
import powtorka.tydzien5.programowanie1.ex006.ex1to6.pizzadough.GlutenFree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Margherita(new GlutenFree()));
        pizzas.add(new Hawaiian(new AllAmericanThin()));
        pizzas.add(new Veggie(new ChessyBites()));
        pizzas.add(new Margherita(Arrays.asList("cheese", "garlic", "onion"), new ChessyBites()));

        for (Pizza p : pizzas) {
            p.preparePizza();
            System.out.println("----------------------------");
        }
    }
}
