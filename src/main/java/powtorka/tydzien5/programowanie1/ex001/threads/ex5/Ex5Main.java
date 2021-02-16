package powtorka.tydzien5.programowanie1.ex001.threads.ex5;

import powtorka.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex5Main {
    public volatile static List<String> listOfFiles = new ArrayList<>();

    public static void main(String[] args) {

        String howManyPersonsGenerate = Utils.displayTextAndGetValue("how many persons generate?", true);
        Integer numberOfPersonsToGenerate = Integer.parseInt(howManyPersonsGenerate);
        ExecutorService es = Executors.newFixedThreadPool(numberOfPersonsToGenerate);

        Ex5 ex5 = new Ex5();
        for (int i = 0; i < numberOfPersonsToGenerate; i++) {
            es.execute(ex5);
        }
        es.shutdown();

        while (true) {
            if (es.isTerminated() && listOfFiles.size() == numberOfPersonsToGenerate) {
                System.out.println("size " + listOfFiles.size());
            }
//        for (String s : listOfFiles) {
//            System.out.println(" "+s);
//        }
//        System.out.println(listOfFiles.size());
        }
    }
}
