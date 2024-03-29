package haagahelia.f1app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import haagahelia.f1app.domain.Constructor;
import haagahelia.f1app.domain.ConstructorRepository;
import haagahelia.f1app.domain.Driver;
import haagahelia.f1app.domain.DriverRepository;
import haagahelia.f1app.domain.Guess;
import haagahelia.f1app.domain.GuessRepository;

@SpringBootApplication
public class F1appApplication {

	public static void main(String[] args) {
		SpringApplication.run(F1appApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ConstructorRepository constructorRepository, DriverRepository driverRepository,
			GuessRepository guessRepository) {
		return (args) -> {

			// luodaan testikuski ja tallennetaan repoon
			Driver testDriver1 = new Driver(1, "Hessu", 5, "Mese");
			driverRepository.save(testDriver1);

			// luodaan testi arvaus ja tallennetaan repoon
			Guess testGuess1 = new Guess("OIKEA RIVI", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
			guessRepository.save(testGuess1);
			Guess testGuess2 = new Guess("AKUN arvaus", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
			guessRepository.save(testGuess2);
			Guess testGuess3 = new Guess("MIKON arvaus", 5, 2, 1, 6, 5, 4, 19, 15, 9, 20, 11, 16, 13, 18, 3, 8, 17, 14, 7, 10);
			guessRepository.save(testGuess3);

			// luodaan testi talli ja tallennetaan repoon
			Constructor testConstructor = new Constructor(1, "Mese", 6, "kuski1", "kuski2");
			constructorRepository.save(testConstructor);

		};
	}

}
