package powtorka.tydzien5.programowanie1.ex001.interfaces;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
@Data
public class LoginWithSaveToFile implements UserLogin {
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
//        <File name="InfoFile" fileName="logs/info.log" append="false">
//            <ThresholdFilter level="WARN" onMatch="DENY" onMismatch="ACCEPT"/>
//            <PatternLayout>
//                <Pattern>%d %p %c{1.} [%t] %m%n</Pattern>
//            </PatternLayout>
//        </File>
//    </Appenders>
//    <Loggers>
//        <Root level="ALL">
//            <AppenderRef level="INFO" ref="InfoFile"/>
//        </Root>
//    </Loggers>
}
