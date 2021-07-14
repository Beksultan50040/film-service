package kg.megacom.filmservice.models.dto;

import lombok.Data;

@Data
public class RequestDto {

    private Long filmId;
    private String startDate;
    private String endDate;

    private ClientDto clinet;
}
