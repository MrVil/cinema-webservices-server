package com.dgrz.cinema.repositories;

import com.dgrz.cinema.entities.Actor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by thomasd on 07/11/16.
 */

@RepositoryRestResource(collectionResourceRel = "actor", path = "actor")
public interface ActorRepository extends PagingAndSortingRepository<Actor, Long>{

    List<Actor> findById(@Param("id") int id);
}
