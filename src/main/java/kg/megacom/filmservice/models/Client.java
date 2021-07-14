package kg.megacom.filmservice.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Client")
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lastName;
    private String firstName;
    private String patronymic;
    private String homeAddress;
    private String birthDate;
}
