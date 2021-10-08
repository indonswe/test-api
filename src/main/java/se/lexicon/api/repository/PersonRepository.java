package se.lexicon.api.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.api.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, Integer> {

    List<Person> findByName(String name);

    Optional<Person> findByEmail(String email);


}
