package powtorka.tydzien5.programowanie1.ex001.interfaces;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
@Data
public class LoginWithConsoleLogs implements UserLogin {
    private Scanner sc = new Scanner(System.in);
    private String name;

    @Override
    public void handleLogin() {
        log.info("provide name: ");
        name = sc.nextLine();
        log.info("provided name: {}", name);
    }
    // needed in log4j2.xml in resources

//    <Appenders>
//        <Console name="Console" target="SYSTEM_OUT">
//            <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %c %M - %msg%n"/>
//        </Console>
//    </Appenders>
//    <Loggers>
//        <Root level="ALL">
//            <AppenderRef level="INFO" ref="Console"/>
//        </Root>
//    </Loggers>
}
