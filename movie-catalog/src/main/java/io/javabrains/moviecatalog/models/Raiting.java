package io.javabrains.moviecatalog.models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Raiting {
    private String movieId;
    private int raiting;
}
