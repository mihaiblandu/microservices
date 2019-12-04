package io.javabrains.raitingdata.models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Raiting {
    private String movieId;
    private int raiting;
}
