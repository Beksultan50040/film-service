package kg.megacom.filmservice.service.impl;

import kg.megacom.filmservice.dao.ClientFilmRep;
import kg.megacom.filmservice.mappers.ClientFilmMapper;
import kg.megacom.filmservice.models.Client;
import kg.megacom.filmservice.models.dto.ClientDto;
import kg.megacom.filmservice.models.dto.ClientFilmsDto;
import kg.megacom.filmservice.models.dto.FilmsDto;
import kg.megacom.filmservice.models.dto.RequestDto;
import kg.megacom.filmservice.service.ClientFilmService;
import kg.megacom.filmservice.service.ClientService;
import kg.megacom.filmservice.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientFilmServiceImpl implements ClientFilmService {

    @Autowired
    private FilmService filmService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private ClientFilmRep clientFilmRep;

    @Override
    public ClientFilmsDto save(RequestDto requestDto) {
        
        ClientFilmsDto clientFilmsDto=new ClientFilmsDto();
        FilmsDto filmsDto=filmService.findById(requestDto.getFilmId());

        clientFilmsDto.setFilms(filmsDto);

        clientFilmsDto.setStartDate(requestDto.getStartDate());
        clientFilmsDto.setEndDate(requestDto.getEndDate());

        clientFilmsDto.setClient(clientService.save(requestDto.getClinet()));
        clientFilmsDto= ClientFilmMapper.INSTANCE.toDto(clientFilmRep.save(ClientFilmMapper.INSTANCE.toEntoty(clientFilmsDto)));



       return clientFilmsDto;

    }
}
