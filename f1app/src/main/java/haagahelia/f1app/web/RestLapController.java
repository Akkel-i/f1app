package haagahelia.f1app.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import haagahelia.f1app.domain.Lap;
import haagahelia.f1app.domain.LapRepository;

@RestController
public class RestLapController {

    /* REST palvelut voisi listätä jokaiselle repositorylle erikseen, mutta nämä samat niihin tulisivat alkuksi, niin en niitä ole tehnyt */

    @Autowired
    private LapRepository lapRepository;

    @RequestMapping(value = "/laps", method = RequestMethod.GET)
    public @ResponseBody List<Lap> LapList() {

        return (List<Lap>) lapRepository.findAll();
    }

    @RequestMapping(value="/lap/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Lap> finddDiverRest(@PathVariable("id") Integer lapId) {	
        return lapRepository.findById(lapId);
    }      
    
    @RequestMapping(value="/laps", method = RequestMethod.POST)
    public @ResponseBody Lap savelapRest(@RequestBody Lap newlap) {	
        return lapRepository.save(newlap);
    }

}
