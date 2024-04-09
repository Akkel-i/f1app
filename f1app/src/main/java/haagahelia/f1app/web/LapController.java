package haagahelia.f1app.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import haagahelia.f1app.domain.Driver;
import haagahelia.f1app.domain.DriverRepository;
import haagahelia.f1app.domain.Lap;
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
    public String showSelectlapsPage(@RequestParam(value = "id1") Integer driver1Id, @RequestParam(value = "id2") Integer driver2Id,
    @RequestParam(value = "race") Integer raceId,
    Model model) {
    
        // lähettää vain kuskin id modelilla
        model.addAttribute("selectedDriver1Id", driver1Id);
        model.addAttribute("selectedDriver2Id", driver2Id);
        model.addAttribute("selectedRaceId", raceId);

        // lähettää kuskin
        List<Driver> drivers1 = driverRepository.findByDriverId(Long.valueOf(driver1Id));
        Driver driver1 = drivers1.get(0);
        model.addAttribute("DRIVER1", driver1);

        //lähettää kuskin
        List<Driver> drivers2 = driverRepository.findByDriverId(Long.valueOf(driver2Id));
        Driver driver2 = drivers2.get(0);
        model.addAttribute("DRIVER2", driver2);

        // lähettää kisan
        List<Race> races = raceRepository.findByRaceId(Long.valueOf(raceId));
        Race race1 = races.get(0);
        model.addAttribute("RACE", race1);

        // kuskin1 ja kuskin2 kierrosajat modellin
        model.addAttribute("Laps", lapRepository.findByDriverAndRace(driver1, race1));
        model.addAttribute("Laps1", lapRepository.findByDriverAndRace(driver2, race1));


        // testi jos kierrokset yhdistää yhteen listaan
        List<Lap> combinedLaps = new ArrayList<>();
        combinedLaps.addAll(lapRepository.findByDriverAndRace(driver1, race1));
        combinedLaps.addAll(lapRepository.findByDriverAndRace(driver2, race1));
        model.addAttribute("CombinedLaps", combinedLaps);


        return "laptimes2"; // laptimes2.html
    }

}
