package com.example.demo.repository;

import com.example.demo.entity.Country;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

    List<Country> findByName(String name);

    @Override
    Optional<Country> findById(Long aLong);

}
