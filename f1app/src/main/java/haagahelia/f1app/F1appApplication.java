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
			Driver testDriver2 = new Driver("Oscar", "Piastri", 81, testConstructor);
			driverRepository.save(testDriver2);

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
			Race testRace1 = new Race("Canadian Grand Prix", "Canada", 55	);
			raceRepository.save(testRace1);
			Race testRace2 = new Race("GRAN PREMIO DEL MADE IN ITALY E DELL'EMILIA-ROMAGNA", "Italia", 61);
			raceRepository.save(testRace2);
			Race testRace3 = new Race("Grand Prix of Monza", "Italia", 51);
			raceRepository.save(testRace3);

			// luodaan testi kierros ja tallennetaan repoon
		

			Lap testLap1 = new Lap(1.123, testRace1, testDriver1);
			lapRepository.save(testLap1);
			Lap testLap2 = new Lap(2.916, testRace1, testDriver1);
			lapRepository.save(testLap2);
			Lap testLap3 = new Lap(3.861, testRace1, testDriver1);
			lapRepository.save(testLap3);
			Lap testLap4 = new Lap(4.447, testRace1, testDriver1);
			lapRepository.save(testLap4);
			Lap testLap5 = new Lap(5.720, testRace1, testDriver1);
			lapRepository.save(testLap5);
			Lap testLap6 = new Lap(6.645, testRace1, testDriver1);
			lapRepository.save(testLap6);
			Lap testLap7 = new Lap(7.852, testRace1, testDriver1);
			lapRepository.save(testLap7);
			Lap testLap8 = new Lap(8.254, testRace1, testDriver1);
			lapRepository.save(testLap8);
			Lap testLap9 = new Lap(9.767, testRace1, testDriver1);
			lapRepository.save(testLap9);
			Lap testLap10 = new Lap(10.183, testRace1, testDriver1);
			lapRepository.save(testLap10);
			Lap testLap11 = new Lap(11.978, testRace1, testDriver1);
			lapRepository.save(testLap11);
			Lap testLap12 = new Lap(12.123, testRace1, testDriver1);
			lapRepository.save(testLap12);
			Lap testLap13 = new Lap(13.123, testRace1, testDriver1);
			lapRepository.save(testLap13);
			Lap testLap14 = new Lap(14.183, testRace2, testDriver1);
			lapRepository.save(testLap14);
			Lap testLap15 = new Lap(15.978, testRace2, testDriver1);
			lapRepository.save(testLap15);
			
			Lap testLap16 = new Lap(16.123, testRace2, testDriver2);
			lapRepository.save(testLap16);
			Lap testLap17 = new Lap(17.123, testRace2, testDriver2);
			lapRepository.save(testLap17);
			Lap testLap18 = new Lap(18.123, testRace1, testDriver2);
			lapRepository.save(testLap18);
			Lap testLap19 = new Lap(19.123, testRace1, testDriver2);
			lapRepository.save(testLap19);


			// monza
			double[] albonMonzaLapTimes = {
				90.785, 87.067, 86.578, 86.684, 86.868, 86.661, 86.773, 86.676, 86.838, 87.305,
				87.389, 87.533, 87.676, 87.723, 92.301, 107.605, 87.087, 86.893, 87.308, 86.853,
				86.601, 86.833, 86.913, 86.748, 86.898, 87.049, 86.735, 87.024, 86.977, 86.940,
				86.735, 86.432, 86.389, 86.579, 86.545, 86.981, 86.831, 87.370, 86.802, 86.572,
				86.675, 86.708, 86.913, 87.725, 86.907, 87.252, 88.491, 86.822, 87.569, 87.197, 87.433
			};

			double[] piastriMonzaLapTimes = {
				90.315, 88.053, 86.982, 87.004, 86.909, 86.878, 86.940, 86.850, 86.864, 86.823,
				87.217, 87.454, 87.518, 87.371, 87.738, 87.201, 87.440, 87.398, 87.352, 87.746,
				87.587, 87.419, 91.866, 106.854, 86.411, 86.287, 86.248, 86.611, 86.132, 87.074,
				86.860, 86.746, 86.445, 86.717, 86.277, 86.639, 86.806, 87.146, 87.166, 86.853,
				94.520, 113.593, 86.072, 85.690, 86.139, 85.732, 86.614, 86.067, 85.841, 86.159, 85.593
			};
			
			Lap testLap20 = new Lap(albonMonzaLapTimes[0], testRace3, testDriver1);
			lapRepository.save(testLap20);
			Lap testLap21 = new Lap(albonMonzaLapTimes[1], testRace3, testDriver1);
			lapRepository.save(testLap21);
			Lap testLap22 = new Lap(albonMonzaLapTimes[2], testRace3, testDriver1);
			lapRepository.save(testLap22);
			Lap testLap23 = new Lap(albonMonzaLapTimes[3], testRace3, testDriver1);
			lapRepository.save(testLap23);
			Lap testLap24 = new Lap(albonMonzaLapTimes[4], testRace3, testDriver1);
			lapRepository.save(testLap24);
			Lap testLap25 = new Lap(albonMonzaLapTimes[5], testRace3, testDriver1);
			lapRepository.save(testLap25);
			Lap testLap26 = new Lap(albonMonzaLapTimes[6], testRace3, testDriver1);
			lapRepository.save(testLap26);
			Lap testLap27 = new Lap(albonMonzaLapTimes[7], testRace3, testDriver1);
			lapRepository.save(testLap27);
			Lap testLap28 = new Lap(albonMonzaLapTimes[8], testRace3, testDriver1);
			lapRepository.save(testLap28);
			Lap testLap29 = new Lap(albonMonzaLapTimes[9], testRace3, testDriver1);
			lapRepository.save(testLap29);
			Lap testLap30 = new Lap(albonMonzaLapTimes[10], testRace3, testDriver1);
			lapRepository.save(testLap30);
			Lap testLap31 = new Lap(albonMonzaLapTimes[11], testRace3, testDriver1);
			lapRepository.save(testLap31);
			Lap testLap32 = new Lap(albonMonzaLapTimes[12], testRace3, testDriver1);
			lapRepository.save(testLap32);
			Lap testLap33 = new Lap(albonMonzaLapTimes[13], testRace3, testDriver1);
			lapRepository.save(testLap33);
			Lap testLap34 = new Lap(albonMonzaLapTimes[14], testRace3, testDriver1);
			lapRepository.save(testLap34);
			Lap testLap35 = new Lap(albonMonzaLapTimes[15], testRace3, testDriver1);
			lapRepository.save(testLap35);
			Lap testLap36 = new Lap(albonMonzaLapTimes[16], testRace3, testDriver1);
			lapRepository.save(testLap36);
			Lap testLap37 = new Lap(albonMonzaLapTimes[17], testRace3, testDriver1);
			lapRepository.save(testLap37);
			Lap testLap38 = new Lap(albonMonzaLapTimes[18], testRace3, testDriver1);
			lapRepository.save(testLap38);
			Lap testLap39 = new Lap(albonMonzaLapTimes[19], testRace3, testDriver1);
			lapRepository.save(testLap39);
			Lap testLap40 = new Lap(albonMonzaLapTimes[20], testRace3, testDriver1);
			lapRepository.save(testLap40);
			Lap testLap41 = new Lap(albonMonzaLapTimes[21], testRace3, testDriver1);
			lapRepository.save(testLap41);
			Lap testLap42 = new Lap(albonMonzaLapTimes[22], testRace3, testDriver1);
			lapRepository.save(testLap42);
			Lap testLap43 = new Lap(albonMonzaLapTimes[23], testRace3, testDriver1);
			lapRepository.save(testLap43);
			Lap testLap44 = new Lap(albonMonzaLapTimes[24], testRace3, testDriver1);
			lapRepository.save(testLap44);
			Lap testLap45 = new Lap(albonMonzaLapTimes[25], testRace3, testDriver1);
			lapRepository.save(testLap45);
			Lap testLap46 = new Lap(albonMonzaLapTimes[26], testRace3, testDriver1);
			lapRepository.save(testLap46);
			Lap testLap47 = new Lap(albonMonzaLapTimes[27], testRace3, testDriver1);
			lapRepository.save(testLap47);
			Lap testLap48 = new Lap(albonMonzaLapTimes[28], testRace3, testDriver1);
			lapRepository.save(testLap48);
			Lap testLap49 = new Lap(albonMonzaLapTimes[29], testRace3, testDriver1);
			lapRepository.save(testLap49);
			Lap testLap50 = new Lap(albonMonzaLapTimes[30], testRace3, testDriver1);
			lapRepository.save(testLap50);
			Lap testLap51 = new Lap(albonMonzaLapTimes[31], testRace3, testDriver1);
			lapRepository.save(testLap51);
			Lap testLap52 = new Lap(albonMonzaLapTimes[32], testRace3, testDriver1);
			lapRepository.save(testLap52);
			Lap testLap53 = new Lap(albonMonzaLapTimes[33], testRace3, testDriver1);
			lapRepository.save(testLap53);
			Lap testLap54 = new Lap(albonMonzaLapTimes[34], testRace3, testDriver1);
			lapRepository.save(testLap54);
			Lap testLap55 = new Lap(albonMonzaLapTimes[35], testRace3, testDriver1);
			lapRepository.save(testLap55);
			Lap testLap56 = new Lap(albonMonzaLapTimes[36], testRace3, testDriver1);
			lapRepository.save(testLap56);
			Lap testLap57 = new Lap(albonMonzaLapTimes[37], testRace3, testDriver1);
			lapRepository.save(testLap57);
			Lap testLap58 = new Lap(albonMonzaLapTimes[38], testRace3, testDriver1);
			lapRepository.save(testLap58);
			Lap testLap59 = new Lap(albonMonzaLapTimes[39], testRace3, testDriver1);
			lapRepository.save(testLap59);
			Lap testLap60 = new Lap(albonMonzaLapTimes[40], testRace3, testDriver1);
			lapRepository.save(testLap60);
			Lap testLap61 = new Lap(albonMonzaLapTimes[41], testRace3, testDriver1);
			lapRepository.save(testLap61);
			Lap testLap62 = new Lap(albonMonzaLapTimes[42], testRace3, testDriver1);
			lapRepository.save(testLap62);
			Lap testLap63 = new Lap(albonMonzaLapTimes[43], testRace3, testDriver1);
			lapRepository.save(testLap63);
			Lap testLap64 = new Lap(albonMonzaLapTimes[44], testRace3, testDriver1);
			lapRepository.save(testLap64);
			Lap testLap65 = new Lap(albonMonzaLapTimes[45], testRace3, testDriver1);
			lapRepository.save(testLap65);
			Lap testLap66 = new Lap(albonMonzaLapTimes[46], testRace3, testDriver1);
			lapRepository.save(testLap66);
			Lap testLap67 = new Lap(albonMonzaLapTimes[47], testRace3, testDriver1);
			lapRepository.save(testLap67);
			Lap testLap68 = new Lap(albonMonzaLapTimes[48], testRace3, testDriver1);
			lapRepository.save(testLap68);
			Lap testLap69 = new Lap(albonMonzaLapTimes[49], testRace3, testDriver1);
			lapRepository.save(testLap69);
			Lap testLap70 = new Lap(albonMonzaLapTimes[50], testRace3, testDriver1);
			lapRepository.save(testLap70);


			for (int i = 0; i < 51; i++) {
			Lap piastriLap = new Lap(piastriMonzaLapTimes[i], testRace3, testDriver2);
			lapRepository.save(piastriLap);
			
		}

		};
	}

}
