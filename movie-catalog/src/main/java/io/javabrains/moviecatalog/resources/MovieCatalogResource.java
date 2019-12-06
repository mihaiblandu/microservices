package io.javabrains.moviecatalog.resources;

import io.javabrains.moviecatalog.models.Movie;
import io.javabrains.moviecatalog.models.Raiting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/{userId}")
    public ResponseEntity<List> getCatalog(@PathVariable("userId") String userId)
    {

        Movie movie = restTemplate.getForObject("http://movie-info-service/movies/1", Movie.class);
        Raiting raiting = restTemplate.getForObject("http://raiting-data-service/raiting/1", Raiting.class);

        System.out.println(movie);
        List list = new ArrayList();
        list.add(movie);
        list.add(raiting);
        ResponseEntity responseEntity = new ResponseEntity(list,HttpStatus.OK);
        return responseEntity;
    }

}
