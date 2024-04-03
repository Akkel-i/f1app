package haagahelia.f1app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import haagahelia.f1app.domain.Driver;
import haagahelia.f1app.domain.DriverRepository;
import haagahelia.f1app.domain.LapRepository;
import haagahelia.f1app.domain.Race;
import haagahelia.f1app.domain.RaceRepository;

@Controller
public class LapController {

    @Autowired
    LapRepository lapRepository;

    @Autowired
    RaceRepository raceRepository;

    @Autowired
    DriverRepository driverRepository;

    // http://localhost:8080/selectlaps
    @RequestMapping(value = "/selectlaps", method = RequestMethod.GET)
    public String selectlapsPage(Model model) {

        // luo listan kaikista kierroksista
        model.addAttribute("laps", lapRepository.findAll());

        model.addAttribute("races", raceRepository.findAll());
        model.addAttribute("drivers", driverRepository.findAll());

        //model.addAttribute("driver", new Driver());

        return "selectlaps"; // selectlaps.html
    }

    /*
     * @RequestMapping(value = "/showlaps", method = RequestMethod.POST)
     * public String showSelectlapsPage(@ModelAttribute Driver
     * driver, @ModelAttribute Race race, Model model) {
     * public String showSelectlapsPage(@RequestParam("driverId") Integer driverId,
     * Model model){
     * 
     * //model.addAttribute("race", race);
     * //model.addAttribute("driver", driver);
     * 
     * model.addAttribute("thedriver", driverRepository.findById(driverId));
     * 
     * return "laptimes2"; // laptimes2.html
     * }
     */

/*     @PostMapping("/showlaps")
    public String showSelectlapsPage(@ModelAttribute("races") Integer selectedRaceId,
            @ModelAttribute("drivers") Integer selectedDriverId,
            Model model) {
        // Pass the selected values to the laptimes2 template
        model.addAttribute("selectedRaceId", selectedRaceId);
        model.addAttribute("selectedDriverId", selectedDriverId);

        return "laptimes2"; // laptimes2.html
    } */

    @PostMapping("/showlaps")
    public String showSelectlapsPage(@RequestParam(value = "id") Integer driverId,
    @RequestParam(value = "race") Integer raceId,
    Model model) {
    
        // Pass the selected values to the laptimes2 template
        model.addAttribute("selectedDriverId", driverId);
        model.addAttribute("selectedRaceId", raceId);
        model.addAttribute("selectedDriver", driverRepository.findById(driverId));


        return "laptimes2"; // laptimes2.html
    }

}
