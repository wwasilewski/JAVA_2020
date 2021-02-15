package powtorka.tydzien5.programowanie1.ex001.threads.ex5;

public class Ex5Main {
    public static void main(String[] args) {
        Ex5 ex5 = new Ex5();
        DataLists dataLists = new DataLists();
//        ex5.run();
        System.out.println(ex5.drawFirstnameFromList());
        System.out.println(ex5.drawAgeOfPerson());
        System.out.println(ex5.drawLastnameFromList());
    }
}
