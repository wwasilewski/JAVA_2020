package powtorka.tydzien1_zadania.varargs;

public class VarargsyMain {
    public static void main(String[] args) {

        Varargsy varargsy = new Varargsy();
        System.out.println(varargsy.laczCiagiZnakow("123", "456", "abc"));
        System.out.println(varargsy.sumujInty(2, 3, 4, 5));
        System.out.println(varargsy.srednia(4, 4, 4, 4, 8));
        System.out.println(varargsy.laczCiagiZnakow2("cos", "sasas", "sasa"));
        System.out.println(varargsy.sumujInty2(4, 7, 1, 3));
        System.out.println(varargsy.srednia2(4, 7, 1, 3));
    }
}
