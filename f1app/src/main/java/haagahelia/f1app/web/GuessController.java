package haagahelia.f1app.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import haagahelia.f1app.domain.Guess;
import haagahelia.f1app.domain.GuessRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Controller
public class GuessController {

    @Autowired
    private GuessRepository guessRepository;

    // http://localhost:8080/newguess.html
    @RequestMapping(value = "/newguess", method = RequestMethod.GET)
    public String getNewGuessForm(Model model) {

        // luo tyhjän Guess-olion lomakkeelle
        model.addAttribute("guess", new Guess());

        return "newguess"; // newguess.html
    }

    @RequestMapping(value = "/saveguess", method = RequestMethod.POST)
    public String saveGuess(@Valid @ModelAttribute("guess") Guess newGuess, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "newguess"; // if error, return to making guess
        } else {
            // tallentaa uuden Guess:in DB
            guessRepository.save(newGuess);
            // palaa endpoint/guesslist (GET)
            return "redirect:/guesslist";
        }
    }

    // EDITS
    @RequestMapping(value = "/editguess/{guessId}", method = RequestMethod.GET)
    public String editGuessGet(@PathVariable("guessId") Long guessId, Model model) {

        Optional<Guess> guessToEdit = guessRepository.findOneGuessById(guessId);

        System.out.println("Valittu kirja on id: " + guessId);
        System.out.println(guessRepository.findOneGuessById(guessId));

        // muokkaa kirjaa
        model.addAttribute("guess", guessToEdit);

        return "editguess"; // editguess.html
    }

    @RequestMapping(value = "/editguess", method = RequestMethod.POST)
    public String editGuessPost(Guess editGuess, Model model) {

        guessRepository.save(editGuess);

        return "redirect:/guesslist";
    }

    // delete toiminto
    @Transactional
    @RequestMapping(value = "/deleteguess/{guessId}", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN')")
    public String deleteGuess(@PathVariable("guessId") Long guessId, Model model) {

        guessRepository.deleteById(guessId);

        return "redirect:/guesslist";
    }

}
