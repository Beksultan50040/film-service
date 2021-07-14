package kg.megacom.filmservice.dao;

import kg.megacom.filmservice.models.Films;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepo extends JpaRepository<Films, Long> {
}
