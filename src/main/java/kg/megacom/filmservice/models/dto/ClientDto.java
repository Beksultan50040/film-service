package kg.megacom.filmservice.models.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class ClientDto {


    private Long id;

    private String lastName;
    private String firstName;
    private String patronymic;
    private String homeAddress;
    private String birthDate;
}
