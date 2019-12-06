package io.javabrains.movieinfo.models;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Movie {
    private String movieId;
    private String name;
    private String description;

}
