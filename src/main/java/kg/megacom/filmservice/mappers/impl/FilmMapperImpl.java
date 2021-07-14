package kg.megacom.filmservice.mappers.impl;

import kg.megacom.filmservice.mappers.FilmMapper;
import kg.megacom.filmservice.models.Films;
import kg.megacom.filmservice.models.dto.FilmsDto;

import java.util.List;
import java.util.stream.Collectors;

public class FilmMapperImpl implements FilmMapper {
    @Override
    public FilmsDto toDto(Films films) {

        FilmsDto filmsDto = new FilmsDto();
        filmsDto.setId(films.getId());
        filmsDto.setName(films.getName());
        filmsDto.setAuthor(films.getAuthor());
        filmsDto.setPrice(films.getPrice());
        return filmsDto;
    }

    @Override
    public Films toEntity(FilmsDto filmsDto) {
        Films films = new Films();
        films.setId(filmsDto.getId());
        films.setName(filmsDto.getName());
        films.setAuthor(filmsDto.getAuthor());
        films.setPrice(filmsDto.getPrice());
        return films;
    }

    @Override
    public List<FilmsDto> toDtos(List<Films> t) {
        return t.stream()
                .map(x-> toDto(x))
                .collect(Collectors.toList());
    }

    @Override
    public List<Films> toEntities(List<FilmsDto> filmsDtos) {
        return filmsDtos
                .stream()
                .map(x->toEntity(x))
                .collect(Collectors.toList());
    }
}
