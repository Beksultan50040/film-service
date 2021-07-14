package kg.megacom.filmservice.service.impl;

import kg.megacom.filmservice.dao.FilmRepo;
import kg.megacom.filmservice.mappers.FilmMapper;
import kg.megacom.filmservice.models.Films;
import kg.megacom.filmservice.models.dto.FilmsDto;
import kg.megacom.filmservice.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmRepo filmRepo;

    @Autowired
    private FilmMapper filmMapper;

    @Override
    public FilmsDto save(FilmsDto filmsDto) {

        Films films = filmMapper.toEntity(filmsDto);
        films = filmRepo.save(films);
        return filmMapper.toDto(films);
    }

    @Override
    public FilmsDto update(FilmsDto filmsDto) {

        return  FilmMapper.INSTANCE.toDto(filmRepo.saveAndFlush(FilmMapper.INSTANCE.toEntity(filmsDto)));

    }

    @Override
    public FilmsDto findById(Long id) {

        Films films = filmRepo.findById(id).get();
        return filmMapper.toDto(films);
    }

    @Override
    public List<FilmsDto> findAll() {
        return filmMapper.toDtos(filmRepo.findAll());
    }
}
