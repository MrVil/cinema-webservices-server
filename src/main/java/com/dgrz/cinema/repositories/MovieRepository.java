package com.dgrz.cinema.repositories;

import com.dgrz.cinema.entities.Movie;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by thomasd on 07/11/16.
 */
@RepositoryRestResource(collectionResourceRel = "Movie", path = "movie")
public interface MovieRepository extends PagingAndSortingRepository<Movie, Long>{

    List<Movie> findById(@Param("id") int id);

    List<Movie> removeById(@Param("id") int id);
}
