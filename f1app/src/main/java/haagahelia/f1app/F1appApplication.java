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
import haagahelia.f1app.domain.Lap;
import haagahelia.f1app.domain.LapRepository;
import haagahelia.f1app.domain.Race;
import haagahelia.f1app.domain.RaceRepository;

@SpringBootApplication
public class F1appApplication {

	public static void main(String[] args) {
		SpringApplication.run(F1appApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ConstructorRepository constructorRepository, DriverRepository driverRepository,
			GuessRepository guessRepository, RaceRepository raceRepository, LapRepository lapRepository) {
		return (args) -> {

			// luodaan testi talli ja tallennetaan repoon
			Constructor testConstructor = new Constructor("Williams");
			constructorRepository.save(testConstructor);

			// luodaan testikuski ja tallennetaan repoon
			Driver testDriver1 = new Driver("Alex", "Albon", 23, testConstructor);
			driverRepository.save(testDriver1);

			// luodaan testi arvaus ja tallennetaan repoon
			Guess testGuess1 = new Guess("OIKEA RIVI", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
					19, 20);
			guessRepository.save(testGuess1);
			Guess testGuess2 = new Guess("AKUN arvaus", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
					19, 20);
			guessRepository.save(testGuess2);
			Guess testGuess3 = new Guess("MIKON arvaus", 5, 2, 1, 6, 5, 4, 19, 15, 9, 20, 11, 16, 13, 18, 3, 8, 17, 14,
					7, 10);
			guessRepository.save(testGuess3);


			// luodaan testi kisa ja tallennetaan repoon
			Race testRace = new Race("Grand Prix of Monza", "Italia", 45);
			raceRepository.save(testRace);

			// luodaan testi kierros ja tallennetaan repoon

			Lap testLap1 = new Lap(1, 1.123, testRace, testDriver1);
			lapRepository.save(testLap1);
			Lap testLap2 = new Lap(2, 2.916, testRace, testDriver1);
			lapRepository.save(testLap2);
			Lap testLap3 = new Lap(3, 3.861, testRace, testDriver1);
			lapRepository.save(testLap3);
			Lap testLap4 = new Lap(4, 4.447, testRace, testDriver1);
			lapRepository.save(testLap4);
			Lap testLap5 = new Lap(5, 5.720, testRace, testDriver1);
			lapRepository.save(testLap5);
			Lap testLap6 = new Lap(6, 6.645, testRace, testDriver1);
			lapRepository.save(testLap6);
			Lap testLap7 = new Lap(7, 7.852, testRace, testDriver1);
			lapRepository.save(testLap7);
			Lap testLap8 = new Lap(8, 8.254, testRace, testDriver1);
			lapRepository.save(testLap8);
			Lap testLap9 = new Lap(9, 9.767, testRace, testDriver1);
			lapRepository.save(testLap9);
			Lap testLap10 = new Lap(10, 10.183, testRace, testDriver1);
			lapRepository.save(testLap10);
			Lap testLap11 = new Lap(11, 11.978, testRace, testDriver1);
			lapRepository.save(testLap11);
			Lap testLap12 = new Lap(12, 12.123, testRace, testDriver1);
			lapRepository.save(testLap12);
			Lap testLap13 = new Lap(13, 13.123, testRace, testDriver1);
			lapRepository.save(testLap13);

		};
	}

}
