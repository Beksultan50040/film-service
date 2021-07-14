package kg.megacom.filmservice.controllers;

import kg.megacom.filmservice.models.dto.FilmsDto;
import kg.megacom.filmservice.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @PostMapping("/save")
    public FilmsDto save (@RequestBody FilmsDto filmsDto){
        return filmService.save(filmsDto);
    }

    @PutMapping("/update")
    public FilmsDto update(@RequestBody FilmsDto filmsDto){
        return filmService.update(filmsDto);
    }

    @GetMapping("/findAll")
    public List<FilmsDto> findAll(){
        return filmService.findAll();
    }

    @GetMapping("findById")
    public FilmsDto findById(Long id){
        return filmService.findById(id);
    }

}
