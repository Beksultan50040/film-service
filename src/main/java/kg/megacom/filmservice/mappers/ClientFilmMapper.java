package kg.megacom.filmservice.mappers;

import kg.megacom.filmservice.models.ClientFilms;
import kg.megacom.filmservice.models.dto.ClientFilmsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientFilmMapper {
    ClientFilmMapper INSTANCE= Mappers.getMapper(ClientFilmMapper.class);

    ClientFilms toEntoty(ClientFilmsDto clientFilmsDto);
    ClientFilmsDto toDto(ClientFilms clientFilms);
}
