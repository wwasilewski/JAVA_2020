package powtorka.tydzien5.programowanie1.ex001.threads.ex5;

import java.io.IOException;
import java.util.Random;
import java.util.UUID;

public class Ex5 implements Runnable {
    private static final Random RANDOM = new Random();

    @Override
    public void run() {
        Person person = new Person();
        person.setFirstname(drawFirstnameFromList());
        person.setLastname(drawLastnameFromList());
        person.setAge(generatePersonAge());
        String fileName = generateFileName();
        Ex5Main.listOfFiles.add(fileName);
        SavePersonDataInFile savePDataInFile = new SavePersonDataInFile(person, fileName);
        try {
            savePDataInFile.saveFileInDirectory();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized String drawFirstnameFromList() {
        String firstnameFromList;
        int positionFromList = RANDOM.nextInt(9);
        firstnameFromList = DataLists.firstnames.get(positionFromList);
        return firstnameFromList;
    }

    public synchronized String drawLastnameFromList() {
        String lastnameFromList;
        int positionFromList = RANDOM.nextInt(9);
        lastnameFromList = DataLists.lastnames.get(positionFromList);
        return lastnameFromList;
    }

    public synchronized int generatePersonAge() {
        return RANDOM.nextInt(100) + 1;
    }

    public synchronized String generateFileName() {
        String randomFileName = "person";
        return (randomFileName + RANDOM.nextInt(100) + "-" + UUID.randomUUID());
    }
}
