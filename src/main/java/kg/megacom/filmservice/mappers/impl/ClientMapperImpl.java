package kg.megacom.filmservice.mappers.impl;

import kg.megacom.filmservice.mappers.ClientMapper;
import kg.megacom.filmservice.models.Client;
import kg.megacom.filmservice.models.dto.ClientDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientMapperImpl implements ClientMapper {
    @Override
    public ClientDto toDto(Client client) {
        ClientDto clientDto = new ClientDto();
        clientDto.setId(client.getId());
        clientDto.setFirstName(client.getFirstName());
        clientDto.setLastName(client.getLastName());
        clientDto.setPatronymic(client.getPatronymic());
        clientDto.setHomeAddress(client.getHomeAddress());
        clientDto.setBirthDate(client.getBirthDate());
        return clientDto;
    }

    @Override
    public Client toEntity(ClientDto clientDto) {
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setFirstName(clientDto.getFirstName());
        client.setLastName(clientDto.getLastName());
        client.setPatronymic(clientDto.getPatronymic());
        client.setHomeAddress(clientDto.getHomeAddress());
        client.setBirthDate(clientDto.getBirthDate());
        return client;
    }

    @Override
    public List<ClientDto> toDtos(List<Client> t) {
        return null;
    }

    @Override
    public List<Client> toEntities(List<ClientDto> clientDtos) {
        return null;
    }
}
