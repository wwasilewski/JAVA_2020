package powtorka.tydzien3.zadania.optional;

import java.util.Optional;

public class Zadanie25 {
    public <T> boolean checkIfNull(T value) {
        return Optional.ofNullable(value).isPresent();
//		if (value == null) {
//			return false;
//		} else {
//			return true;
//		}
    }

    public <T> void printValue(T value) {
        Optional.ofNullable(value).ifPresent(System.out::println);
//		if (value != null) {
//			System.out.println(value);
//		}
    }

    public String checkValue(String valueToCheck) {
        return Optional.ofNullable(valueToCheck).orElse("n/a");
//		if (valueToCheck == null) {
//			return "n/a";
//		} else {
//			return valueToCheck;
//		}
    }

    public <T> T throwExceptionWhenNull(T value) {
        return Optional.ofNullable(value).orElseThrow(() -> new IllegalArgumentException("Remember, please do not provide null value!"));
//		if(value == null)
//		{
//			throw new IllegalArgumentException("Remember, please do not provide null value!");
//		}
//		return value;
    }

    public <T> Optional returnOptional(T value) {
        return Optional.of(value);
    }

    public <T> Optional returnOptionalIfNotEmpty(T value) {
        return Optional.ofNullable(value);
    }

    public Boolean checkIfCarMatchThePrice(Car car, Double min, Double max) {
        return Optional.ofNullable(car)
                .filter(c -> c.getPrice() > min)
                .filter(c -> c.getPrice() < max)
                .isPresent();
//		if (car.getPrice() > min && car.getPrice() < max) {
//			return true;
//		} else {
//			return false;
//		}
//		return car.getPrice() > min && car.getPrice() < max;
    }
}
