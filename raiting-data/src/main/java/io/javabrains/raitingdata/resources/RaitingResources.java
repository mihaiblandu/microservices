package io.javabrains.raitingdata.resources;

import io.javabrains.raitingdata.models.Raiting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/raiting")
public class RaitingResources {

    @GetMapping("/{movieId}")
    public Raiting getRaiting(@PathVariable("movieId") String movieId)
    {
        Raiting raiting = new Raiting();
        raiting.setMovieId("1");
        raiting.setRaiting(5);
        return raiting;
    }
}
