package powtorka.tydzien5.programowanie1.ex006;

import java.util.ArrayList;
import java.util.List;

public class Hawaiian implements Pizza, Ingredients {
    private List<String> listOfIngredients;

    public Hawaiian() {
        this.listOfIngredients = new ArrayList<>();
        listOfIngredients.add("tomato sauce");
        listOfIngredients.add("cheese");
        listOfIngredients.add("pineapple");
        listOfIngredients.add("ham");
    }

    public Hawaiian(List<String> listOfIngredients) {
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
