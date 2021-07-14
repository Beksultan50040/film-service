package kg.megacom.filmservice.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Client_Films")
@Data
public class ClientFilms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "dd.MM.yyy")
    private String startDate;

    @JsonFormat(pattern = "dd.MM.yyy")
    private String EndDate;

    @ManyToOne
    @JoinColumn(name = "id_films")
    private Films films;

    @ManyToOne
    @JoinColumn(name = "id_clients")
    private Client client;
}

