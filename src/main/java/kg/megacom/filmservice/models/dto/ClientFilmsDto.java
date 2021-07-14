package kg.megacom.filmservice.models.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megacom.filmservice.models.Client;
import kg.megacom.filmservice.models.Films;
import lombok.Data;

import javax.persistence.*;

@Data
public class ClientFilmsDto {


    private Long id;

    @JsonFormat(pattern = "dd.MM.yyy")
    private String startDate;

    @JsonFormat(pattern = "dd.MM.yyy")
    private String EndDate;


    private FilmsDto films;


    private ClientDto client;
}

