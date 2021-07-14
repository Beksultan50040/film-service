package kg.megacom.filmservice.service.impl;

import kg.megacom.filmservice.dao.ClientRepo;
import kg.megacom.filmservice.mappers.ClientMapper;
import kg.megacom.filmservice.models.Client;
import kg.megacom.filmservice.models.dto.ClientDto;
import kg.megacom.filmservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepo clientRepo;

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public ClientDto save(ClientDto clientDto) {
        Client client = clientMapper.toEntity(clientDto);
        client = clientRepo.save(client);
        return clientMapper.toDto(client);

    }

    @Override
    public ClientDto update(ClientDto clientDto) {
        return null;
    }

    @Override
    public ClientDto findById(Long id) {
        return null;
    }

    @Override
    public List<ClientDto> findAll() {
        return null;
    }
}
