package powtorka.tydzien5.programowanie1.ex001.interfaces;

public class Main {
    public static void main(String[] args) {
        LoginWithConsoleLogs login1 = new LoginWithConsoleLogs();
        login1.handleLogin();

        LoginWithSaveToFile login2 = new LoginWithSaveToFile();
        login2.handleLogin();
    }
}
