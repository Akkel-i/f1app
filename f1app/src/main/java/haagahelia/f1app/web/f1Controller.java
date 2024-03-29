package haagahelia.f1app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import haagahelia.f1app.domain.Guess;
import haagahelia.f1app.domain.GuessRepository;

@Controller
public class f1Controller {

    @Autowired
    private GuessRepository guessRepository;

    // http://localhost:8080/index
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String indexPage() {
        return "index"; // index.html
    }

    // http://localhost:8080/guesslist
    @RequestMapping(value = "/guesslist", method = RequestMethod.GET)
    public String getGuesses(Model model) {

        // luo listan kaikista DB kirjoista
        model.addAttribute("guesses", guessRepository.findAll());

        return "guesslist"; // guesslist.html
    }

    // http://localhost:8080/laptimes
    @RequestMapping(value = "/laptimes", method = RequestMethod.GET)
    public String laptimesPage() {
        return "laptimes"; // laptimes.html
    }

/*     // http://localhost:8080/newguess
    @RequestMapping(value = "/newguess", method = RequestMethod.GET)
    public String newguessPage() {
        return "newguess"; // newguess.html
    } */



    // http://localhost:8080/newguess.html
    @RequestMapping(value = "/newguess", method = RequestMethod.GET)
    public String getNewGuessForm(Model model) {

        // luo tyhjän Book-olion lomakkeelle
        model.addAttribute("guess", new Guess());
        // luo listan kaikista kategorioista
        //model.addAttribute("guesses", guessRepository.findAll());
        return "newguess"; // newguess.html
    }

    @RequestMapping(value = "/saveguess", method = RequestMethod.POST)
    public String saveGuess(Guess newGuess, Model model) {

        // tallentaa uuden Guess:in DB
        guessRepository.save(newGuess);
        // palaa endpoint/guesslist (GET)
        return "redirect:/guesslist";
    }

}
