package haagahelia.f1app.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface RaceRepository extends CrudRepository<Race, Integer> {

    Optional<Race> findById(Integer id);

}
