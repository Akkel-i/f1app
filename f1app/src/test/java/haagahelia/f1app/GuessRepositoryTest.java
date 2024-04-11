package haagahelia.f1app;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;


import haagahelia.f1app.domain.Guess;
import haagahelia.f1app.domain.GuessRepository;

@DataJpaTest
public class GuessRepositoryTest {

    @Autowired
    private GuessRepository guessRepository;

    @Test
    public void findByIdAssertTest() {
        List<Guess> guesses = guessRepository.findById(Long.valueOf(1));
        assertThat(guesses).hasSize(1);
        //assertThat(guesses.get(0).getGuessMaker().isEqualTo("OIKEA RIVI")); isEqualTo ei toimi?
    }

    @Test
    public void createNewGuess() {
    Guess testGuess = new Guess("Hessu", 5, 4, 3, 2, 1, 6, 7, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8);
    guessRepository.save(testGuess);
    assertThat(testGuess.getId()).isNotNull();
    } 

    @Test
    public void updateGuess() {
        Guess testGuess = new Guess("Hessu", 5, 4, 3, 2, 1, 6, 7, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8);
        guessRepository.save(testGuess);

        List<Guess> guesses = guessRepository.findByGuessMaker("Hessu");

        if (!guesses.isEmpty()) { 
            Guess guessToEdit = guesses.get(0);
            guessToEdit.setGuessMaker("Masa");

        List<Guess> newGuesses = guessRepository.findByGuessMaker("Masa");

        assertThat(newGuesses.get(0).getGuessMaker().contains("Masa"));
        }
        else {
            System.out.println("No guesses found for 'Hessu'");
        }
    } 

    @Test
    public void removeGuess() {
        List<Guess> guesses = guessRepository.findByGuessMaker("Masa");
        if (!guesses.isEmpty()) { 
            Integer theID = guesses.get(0).getId();

            guessRepository.deleteById(theID);
        }
        assertThat(guesses.isEmpty());
    }

}

