package kg.megacom.filmservice.mappers;

import kg.megacom.filmservice.mappers.impl.FilmMapperImpl;
import kg.megacom.filmservice.models.Films;
import kg.megacom.filmservice.models.dto.FilmsDto;

public interface FilmMapper extends  BaseMapperMethods<FilmsDto, Films> {

        FilmMapper INSTANCE = new FilmMapperImpl();

}
