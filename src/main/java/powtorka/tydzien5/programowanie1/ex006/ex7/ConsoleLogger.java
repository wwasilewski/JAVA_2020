package powtorka.tydzien5.programowanie1.ex006.ex7;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        log.info("provided name: " + message);
    }
}
