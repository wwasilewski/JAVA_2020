package powtorka.tydzien5.programowanie1.ex001.threads.ex5;

import java.io.IOException;
import java.util.Random;

public class Ex5 implements Runnable {
    private static final Random RANDOM = new Random();

    @Override
    public void run() {
        new DataLists();
        Person person = new Person();
        person.setFirstname(drawFirstnameFromList());
        person.setLastname(drawLastnameFromList());
        person.setAge(drawAgeOfPerson());
        String fileName = drawFileName();
        SavePersonDataInFile savePDataInFile = new SavePersonDataInFile(person, fileName);
        try {
            savePDataInFile.saveFileInDirectory();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String drawFirstnameFromList() {
        String firstnameFromList;
        int positionFromList = RANDOM.nextInt(9);
        firstnameFromList = DataLists.firstnames.get(positionFromList);
        return firstnameFromList;
    }

    public String drawLastnameFromList() {
        String lastnameFromList;
        int positionFromList = RANDOM.nextInt(9);
        lastnameFromList = DataLists.lastnames.get(positionFromList);
        return lastnameFromList;
    }

    public int drawAgeOfPerson() {
        return RANDOM.nextInt(100) + 1;
    }

    public String drawFileName() {
        String randomFileName = "fileWithRandomNumber";
        return (randomFileName + RANDOM.nextInt(100));
    }
}
