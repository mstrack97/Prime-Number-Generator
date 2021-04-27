package matt.homework;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class PrimeNumberController {
	@Autowired
	PrimeNumberGenerator primeNumberGenerator;

	@GetMapping("/")
	public ArrayList<Integer> runPrimeFunction() {
		return primeNumberGenerator.getPrimeList();
	}
}

    