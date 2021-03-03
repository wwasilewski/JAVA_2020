/*
Napisz program, który będzie symulować pracę biletomatu.
a. Użytkownik podaje ilość biletów (zakładamy, że każdy kosztuje 4 PLN).
b. Program prosi o dokonanie zapłaty.
c. Użytkownik wpisuje kwotę do konsoli.
d. Program wypisuje należną resztę w postaci:
e. Suma reszty: (a+b+c+d+e) PLN
a = 200*A
b = 100*B
c = 50*C
d = 20*D
e = 10*E
f = 5*F
g = 2*G
h = 1*H
Gdzie A-H to ilość wydanych banknotów/monet, z których składa się reszta.
*/

package powtorka.tydzien5.programowanie1.ex009.ex4;

public class TicketMachine {

    private static final int COST_OF_TICKET = 4;

    public void returnRestOfMoney(int numberOfTickets, int money) {
        int costOfTickets = numberOfTickets * COST_OF_TICKET;
        int rest = money - costOfTickets;
        int twohund = 0, onehund = 0, fifty = 0, twenty = 0, ten = 0;
        int five = 0, two = 0, one = 0;

        while (rest > 0) {
            if (rest >= 200) {
                twohund++;
                rest = rest - 200;
            } else if (rest >= 100) {
                onehund++;
                rest = rest - 100;
            } else if (rest >= 50) {
                fifty++;
                rest = rest - 50;
            } else if (rest >= 20) {
                twenty++;
                rest = rest - 20;
            } else if (rest >= 10) {
                ten++;
                rest = rest - 10;
            } else if (rest >= 5) {
                five++;
                rest = rest - 5;
            } else if (rest >= 2) {
                two++;
                rest = rest - 2;
            } else {
                one++;
                rest = rest - 1;
            }
        }
        System.out.println("rest of the money: (a+b+c+d+e+f+g+h)");
        System.out.print("a= 200*" + twohund + " b= 100*" + onehund + " c= 50*" + fifty + " d= 20*"
                + twenty + " e= 10*" + ten + " f= 5*" + five + " g= 2*" + two + " h= 1*" + one);
    }
}
