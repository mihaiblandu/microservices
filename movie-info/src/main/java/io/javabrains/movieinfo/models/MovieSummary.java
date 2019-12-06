package io.javabrains.movieinfo.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class MovieSummary {

    private String id;
    private String title;
    private String overview;

}