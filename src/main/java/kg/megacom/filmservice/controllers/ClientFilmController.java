package kg.megacom.filmservice.controllers;

import kg.megacom.filmservice.models.dto.ClientFilmsDto;
import kg.megacom.filmservice.models.dto.RequestDto;
import kg.megacom.filmservice.service.ClientFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clientFilm")
public class ClientFilmController {

    @Autowired
    private ClientFilmService clientFilmService;

    @PostMapping("save")
    public ClientFilmsDto save(@RequestBody RequestDto requestDto){
        return clientFilmService.save(requestDto);
    }
}
