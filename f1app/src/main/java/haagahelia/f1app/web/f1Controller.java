package haagahelia.f1app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

        // luo listan kaikista DB arvauksista
        // model.addAttribute("guesses", guessRepository.findAll()); näyttää kaikki
        model.addAttribute("guesses", guessRepository.findByIdNot(Long.valueOf(1)));

        return "guesslist"; // guesslist.html
    }

    // näyttää arvaukset oikean vastauksen kanssa
    // http://localhost:8080/guesslistrightanswer
    @RequestMapping(value = "/guesslistrightanswer", method = RequestMethod.GET)
    public String getRightGuesses(Model model) {

        // luo listan kaikista DB arvauksista
        // model.addAttribute("guesses", guessRepository.findAll());
        model.addAttribute("guesses", guessRepository.findByIdNot(Long.valueOf(1)));
        model.addAttribute("rightGuesses", guessRepository.findById(Long.valueOf(1)));

        return "guesslistrightanswer"; // guesslistrightanswer.html
    }


}
