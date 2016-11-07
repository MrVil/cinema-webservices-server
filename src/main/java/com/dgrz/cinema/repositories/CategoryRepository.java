package com.dgrz.cinema.repositories;

import com.dgrz.cinema.entities.Categorie;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by thomasd on 07/11/16.
 */
public interface CategoryRepository extends PagingAndSortingRepository<Categorie,Long> {

    List<Categorie> findById(@Param("CodeCat") int CodeCat);
}
