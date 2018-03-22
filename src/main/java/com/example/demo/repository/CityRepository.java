package com.example.demo.repository;

import com.example.demo.entity.City;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
    List<City> findByName(String name);

    @Query(nativeQuery = true,
            value = "select * from people_storage.city where city.country_id = country_id ")
    List<City> findByCountryId(@Param("country_id") Long id);
}