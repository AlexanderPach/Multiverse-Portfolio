package com.alexsExample.springboot.repository;

import com.alexsExample.springboot.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @purpose Extends JPA Repository which allows for ORM (Object Relational Mapping)
 */
@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {

}
