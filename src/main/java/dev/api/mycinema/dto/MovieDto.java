package dev.api.mycinema.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MovieDto {

    private String title;

    private String description;

    private Integer review;

    private Date release_year;
}
