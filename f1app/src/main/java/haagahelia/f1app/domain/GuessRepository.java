package haagahelia.f1app.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface GuessRepository extends CrudRepository<Guess, Integer> {

    List<Guess> findByIdNot(Long id);
    List<Guess> findById(Long id);
    List<Guess> findByGuessMaker(String guessMaker);

    Optional<Guess> findOneGuessById(Long id);

    void deleteById(Long id);

}

