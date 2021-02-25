/*
Przygotuj interfejs o nazwie Pizza do wypiekania pizzy posiadający jedną metodę
void preparePizza(). Zaimplementuj w/w interfejs w klasie Margherita, Hawaiian,
Veggie. Niech metoda preparePizza() wyświetla na konsoli kroki jakie należy
wykonać aby przygotować pizzę. Każda pizza powinna mieć listę składników, która
będzie przechowywana jako lista. Utwórz konstruktor bezparametrowy oraz taki,
który umożliwia przekazanie listy składników do każdej pizzy.
2. Przygotuj interfejs o nazwie Ingredients do pobierania składników pizzy posiadający
metodę List<String> getIngredients() zwracający listę składników i zaimplementuj go
w każdej pizzy.
3. Przygotuj interfejs do wyrabiania ciasta o nazwie PizzaDough, a w nim metodę void
preparePizzaDough().
Przygotuj następujące klasy implementujące interfejs PizzaDough
a. AllAmericanThin
b. GlutenFree
c. ChessyBites
d. Pan
e. FeelGoodFlatbread
f. StuffedCrust
Zaimplementuj metodę preparePizzaDough() w każdej klasie. Niech ta metoda
wyświetla tekst na konsoli “Przygotowywanie ciasta <nazwa_ciasta>”
4. Dodaj zmienną prywatną typu PizzaDough w każdej pizzy i rozszerz konstruktor
klasy tak aby przyjmował zmienną PizzaDough jako argument i przypisywał go do
utworzonej zmiennej.
5. Rozszerz metodę preparePizza() tak aby jako pierwszy krok była wykonywana
metoda preparePizzaDough() obiektu przypisanego do zmiennej typu PizzaDough.
*/

package powtorka.tydzien5.programowanie1.ex006;

import powtorka.tydzien5.programowanie1.ex006.pizzadough.PizzaDough;

import java.util.ArrayList;
import java.util.List;

public class Veggie implements Pizza, Ingredients {
    private List<String> listOfIngredients;
    private PizzaDough dough;

    public Veggie(PizzaDough dough) {
        this.dough = dough;
        this.listOfIngredients = new ArrayList<>();
        listOfIngredients.add("tomato sauce");
        listOfIngredients.add("cheese");
        listOfIngredients.add("onion");
        listOfIngredients.add("spinach");
    }

    public Veggie(List<String> listOfIngredients, PizzaDough dough) {
        this.dough = dough;
        this.listOfIngredients = listOfIngredients;
    }

    @Override
    public void preparePizza() {
        System.out.println("Veggie");
        System.out.println("prepare pizza dough");
        dough.preparePizzaDough();
        System.out.println("add ingredients:");
        for (String i : listOfIngredients) {
            System.out.print(i + " ");
        }
        System.out.println("\nbake the pizza");
    }

    @Override
    public List<String> getIngredients() {
        return listOfIngredients;
    }
}
