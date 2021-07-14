package kg.megacom.filmservice.dao;

import kg.megacom.filmservice.models.ClientFilms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientFilmRep extends JpaRepository<ClientFilms,Long> {
}
