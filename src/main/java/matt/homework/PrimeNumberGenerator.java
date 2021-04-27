package matt.homework;
import org.springframework.stereotype.Component;
import java.util.ArrayList;


@Component
public class PrimeNumberGenerator {
    ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

	public ArrayList<Integer> getPrimeNumbers() {
        primeNumbers.add(1);
		int loopNum = 1;
		int lastPrime = 0;
		while (loopNum <= 1000) {
			int counter = 0;
			for (int i = 1; i <= lastPrime; i++) {
				if (lastPrime % i == 0) {
					counter++;
				}
			}
			if (counter == 2) {
                primeNumbers.add(lastPrime);
				loopNum++;
			}
			lastPrime++;
		}
		return primeNumbers;
	}
}