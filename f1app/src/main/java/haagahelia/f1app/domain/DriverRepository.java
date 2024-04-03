package haagahelia.f1app.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface DriverRepository extends CrudRepository<Driver, Integer> {

    Optional<Driver> findById(Integer id);

    List<Driver> findByDriverId(Long id);
}
