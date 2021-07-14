package kg.megacom.filmservice.models.dto;


import lombok.Data;

import javax.persistence.*;

@Data
public class FilmsDto {


    private Long id;

    private String name;
    private String author;
    private double price;

}
