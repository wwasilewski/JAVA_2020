package powtorka.tydzien5.programowanie1.ex009.ex4;

import powtorka.Utils;

public class Main {
    public static void main(String[] args) {
        Integer numberOfTickets = Utils.displayTextAndGetInt("How many tickets?");
        Integer moneyForTickets = Utils.displayTextAndGetInt("Time to pay, deposit money: ");
        TicketMachine tm = new TicketMachine();
        tm.returnRestOfMoney(numberOfTickets, moneyForTickets);
    }
}
