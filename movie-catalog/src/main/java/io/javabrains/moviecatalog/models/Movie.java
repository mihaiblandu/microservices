package io.javabrains.moviecatalog.models;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Movie {
    private String name;
    private int id;
}
