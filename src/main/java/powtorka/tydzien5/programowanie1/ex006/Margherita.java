package powtorka.tydzien5.programowanie1.ex006;

import java.util.ArrayList;
import java.util.List;

public class Margherita implements Pizza, Ingredients {
    private List<String> listOfIngredients;

    public Margherita() {
        this.listOfIngredients = new ArrayList<>();
        listOfIngredients.add("tomato sauce");
        listOfIngredients.add("cheese");
    }

    public Margherita(List<String> listOfIngredients) {
        this.listOfIngredients = listOfIngredients;
    }

    @Override
    public void preparePizza() {
        System.out.println("prepare pizza dough");
        System.out.println("add ingredients:");
        System.out.println("bake the pizza");
    }

    @Override
    public List<String> getIngredients() {
        return listOfIngredients;
    }
}
