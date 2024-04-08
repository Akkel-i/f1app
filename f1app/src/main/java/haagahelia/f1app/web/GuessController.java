package haagahelia.f1app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import haagahelia.f1app.domain.Guess;
import haagahelia.f1app.domain.GuessRepository;
import jakarta.validation.Valid;

@Controller
public class GuessController {

    @Autowired
    private GuessRepository guessRepository;

    // http://localhost:8080/newguess.html
    @RequestMapping(value = "/newguess", method = RequestMethod.GET)
    public String getNewGuessForm(Model model) {

        // luo tyhjän Book-olion lomakkeelle
        model.addAttribute("guess", new Guess());

        return "newguess"; // newguess.html
    }

    @RequestMapping(value = "/saveguess", method = RequestMethod.POST)
    public String saveGuess(@Valid @ModelAttribute("guess") Guess newGuess, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "newguess"; // if error, return to making guess
        }
        else {
            // tallentaa uuden Guess:in DB
            guessRepository.save(newGuess);
            // palaa endpoint/guesslist (GET)
            return "redirect:/guesslist";
        }
    }

}
