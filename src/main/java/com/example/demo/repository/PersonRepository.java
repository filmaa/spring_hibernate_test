package com.example.demo.repository;

import com.example.demo.entity.Person;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByName(String name);

    @Query(value = "SELECT p FROM Person p WHERE p.name = :name", nativeQuery = true)
    List<Person> findPersons(@Param("name") String name);
}
