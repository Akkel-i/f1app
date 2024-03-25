package haagahelia.f1app.domain;


/* @Entity joku dependency puuttuu?  */
public class Guess {

    // atribuuti
    private Integer id;
/*     private User guessMaker;  vasta kun kunnnon database */
    private String guess;



    // constructor

    public Guess() {
        super();
        this.id = null;
        this.guess = null;
    }

    public Guess(Integer id, String guess) {
        this.id = id;
        this. guess = guess;
    }

    // get


    // set



}
