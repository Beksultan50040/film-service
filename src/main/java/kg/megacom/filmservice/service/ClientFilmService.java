package kg.megacom.filmservice.service;

import kg.megacom.filmservice.models.dto.ClientFilmsDto;
import kg.megacom.filmservice.models.dto.RequestDto;

public interface ClientFilmService {

    ClientFilmsDto save (RequestDto requestDto);
}
