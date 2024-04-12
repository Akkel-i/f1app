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

import haagahelia.f1app.domain.Driver;
import haagahelia.f1app.domain.DriverRepository;

@RestController
public class RestDriverController {

    @Autowired
    private DriverRepository driverRepository;

    @RequestMapping(value = "/drivers", method = RequestMethod.GET)
    public @ResponseBody List<Driver> LapList() {

        return (List<Driver>) driverRepository.findAll();
    }

        @RequestMapping(value="/driver/{id}", method = RequestMethod.GET)
        public @ResponseBody Optional<Driver> finddDiverRest(@PathVariable("id") Integer driverId) {	
            return driverRepository.findById(driverId);
        }      
        

        @RequestMapping(value="/drivers", method = RequestMethod.POST)
        public @ResponseBody Driver saveDriverRest(@RequestBody Driver newdriver) {	
            return driverRepository.save(newdriver);
        }


}
