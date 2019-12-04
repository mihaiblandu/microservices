package io.javabrains.moviecatalog.resources;

import io.javabrains.moviecatalog.models.CatalogItem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {


    @GetMapping("/{userId}")
    public ResponseEntity<List> getCatalog(@PathVariable("userId") String userId)
    {

        List list = Collections.singletonList(
                CatalogItem.builder().name("Harry Potter")
                        .desc("Fantazy").rating(5).build()
                );

        ResponseEntity responseEntity = new ResponseEntity(list,HttpStatus.OK);
        return responseEntity;
    }

}
