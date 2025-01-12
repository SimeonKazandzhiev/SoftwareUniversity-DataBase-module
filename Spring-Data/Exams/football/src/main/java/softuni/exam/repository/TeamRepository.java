package softuni.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.exam.domain.entities.Team;

import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository<Team,Long> {

    boolean findByName(String name);

    Optional<Team> findTeamByName(String name);

}
