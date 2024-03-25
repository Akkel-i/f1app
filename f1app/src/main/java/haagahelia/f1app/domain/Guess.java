package haagahelia.f1app.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Guess {

    // atribuuti
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer guessId;
/*     private User guessMaker;  vasta kun kunnnon database */
    private String guess;



    // constructor

    public Guess() {
        super();
        this.guessId = null;
        this.guess = null;
    }

    public Guess(Integer guessId, String guess) {
        this.guessId = guessId;
        this.guess = guess;
    }

    // get

    public Integer getId() {
        return guessId;
    }

    public String getGuess() {
        return guess;
    }

    // set

    public void setId(Integer guessId) {
        this.guessId = guessId;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }


    
    @Override
    public String toString() {
        return "Guess [id=" + guessId + ", guess=" + guess + "]";
    }







}
