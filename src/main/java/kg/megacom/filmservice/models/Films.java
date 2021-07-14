package kg.megacom.filmservice.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Films")
@Data
public class Films {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String author;
    private double price;

}
