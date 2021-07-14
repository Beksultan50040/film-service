package kg.megacom.filmservice.mappers;

import kg.megacom.filmservice.mappers.impl.ClientMapperImpl;
import kg.megacom.filmservice.models.Client;
import kg.megacom.filmservice.models.dto.ClientDto;
import kg.megacom.filmservice.service.BaseCrudService;

public interface ClientMapper extends BaseMapperMethods<ClientDto, Client> {

    ClientMapper INSTANCE = new ClientMapperImpl();
}
