package com.example.demo;

import com.example.demo.entity.City;
import com.example.demo.entity.Country;
import com.example.demo.entity.Person;
import com.example.demo.repository.CityRepository;
import com.example.demo.repository.CountryRepository;
import com.example.demo.repository.PersonRepository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private CountryRepository countryRepository;


    @Test
    public void contextLoads() {
        Person person = new Person("testName1", "testSurname1", "testAddress1");
        personRepository.save(person);
    }

    @Test
    public void findByNameTest() {
        List<Person> person = personRepository.findByName("testName");
        Assert.assertNotNull(person);
    }

    @Test
    public void findPersons() {
        List<Person> persons = personRepository.findPersons("testName");
        Assert.assertFalse(persons.isEmpty());
    }

    @Test
    public void findCityByName() {
        List<City> cities = cityRepository.findByName("London");
    }

    @Test
    public void addCity() {
        City city = new City("London");
        cityRepository.save(city);
    }

    @Test
    public void addCountry() {
        countryRepository.save(new Country("Belarus"));
    }

    @Test
    public void getCitiesByCountry() {
//        todo
        Country country = countryRepository.findByName("GB").get(0);
        List<City> cities = country.getCity();
        System.out.println(country.toString());
    }


}
