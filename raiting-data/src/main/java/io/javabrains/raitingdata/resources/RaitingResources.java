package io.javabrains.raitingdata.resources;

import io.javabrains.raitingdata.models.Raiting;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/raiting")
public class RaitingResources {


    @Value("${app.name}")
    private String demo;

    @GetMapping("/{movieId}")
    public Raiting getRaiting(@PathVariable("movieId") String movieId)
    {

        Raiting raiting = new Raiting();
        raiting.setMovieId("1 " + demo);
        raiting.setRaiting(5);
        return raiting;
    }
}
