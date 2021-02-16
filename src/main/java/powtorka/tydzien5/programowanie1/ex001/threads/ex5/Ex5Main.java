package powtorka.tydzien5.programowanie1.ex001.threads.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex5Main {
    public volatile static List<String> listOfFiles = new ArrayList<>();

    public static void main(String[] args) {
        new DataLists();
        Ex5 ex5 = new Ex5();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many threads?");
        int numberOfThreads = sc.nextInt();
        ExecutorService es = Executors.newFixedThreadPool(numberOfThreads);

        for (int i = 0; i < numberOfThreads; i++) {
            es.execute(ex5);
        }
        es.shutdown();

        //this loop waits for es to finish
        while (true) {
            if (es.isTerminated()) {
                System.out.println("generated files: ");
                for (String s : listOfFiles) {
                    System.out.println(s);
                }
                break;
            }
        }
    }
}
