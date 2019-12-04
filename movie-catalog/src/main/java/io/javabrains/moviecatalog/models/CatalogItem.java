package io.javabrains.moviecatalog.models;

import lombok.*;

@Getter
@Builder
@EqualsAndHashCode
@ToString
public class CatalogItem {
    private String name;
    private String desc;
    private int rating;

}
