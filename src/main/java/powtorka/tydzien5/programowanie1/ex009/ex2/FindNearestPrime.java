package powtorka.tydzien5.programowanie1.ex009.ex2;

public class FindNearestPrime {
    PrimeChecker primeChecker;

    public FindNearestPrime() {
        this.primeChecker = new PrimeChecker();
    }

    public Integer findPrime(Integer number) {
        Integer smallerPrime = findSmallerPrime(number);
        Integer greaterPrime = findGreaterPrime(number);

        if (number - smallerPrime >= greaterPrime - number) {
            return greaterPrime;
        } else {
            return smallerPrime;
        }
    }

    private Integer findSmallerPrime(Integer number) {
        int smallerPrime = 0;
        for (int i = number - 1; i > 2; i--) {
            if (primeChecker.isPrime(i)) {
                smallerPrime = i;
                break;
            }
        }
        return smallerPrime;
    }

    private Integer findGreaterPrime(Integer number) {
        int greaterPrime = 0;
        for (int i = number + 1; i < Integer.MAX_VALUE; i++) {
            if (primeChecker.isPrime(i)) {
                greaterPrime = i;
                break;
            }
        }
        return greaterPrime;
    }
}
