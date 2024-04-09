package haagahelia.f1app.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LapRepository extends CrudRepository<Lap, Integer>{

    List<Lap> findByDriverAndRace(Driver driver, Race race);

    //List<Lap> findByDriverAndRace(Driver driver1, Driver driver2, Race race);

}
