package powtorka.tydzien5.programowanie1.ex006.ex7;

import powtorka.Utils;

public class Main {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();
        String nameToLog = Utils.displayTextAndGetValue("provide name to log: ", true);

        logMessage(consoleLogger, nameToLog);
        logMessage(fileLogger, nameToLog);
    }

    public static void logMessage(Logger logger, String message) {
        logger.log(message);
    }
}
