package io.javabrains.movieinfo.resources;

import io.javabrains.movieinfo.models.Movie;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/movies")
public class MovieResources {

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId)
    {
        return Movie.builder().name("Harry potter").id(1).build();
    }
}
