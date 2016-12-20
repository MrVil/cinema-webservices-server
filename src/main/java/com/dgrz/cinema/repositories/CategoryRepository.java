package com.dgrz.cinema.repositories;

import com.dgrz.cinema.entities.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by thomasd on 07/11/16.
 */
@RepositoryRestResource(collectionResourceRel = "Category", path = "category")
public interface CategoryRepository extends PagingAndSortingRepository<Category,Long> {

    List<Category> findById(@Param("CodeCat") int CodeCat);
}
