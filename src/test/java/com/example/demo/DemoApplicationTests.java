package com.example.demo;

import com.example.demo.entity.Person;
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

    @Test
    public void contextLoads() {
//		Person person = new Person("testName", "testSurname", "testAddress");
//		personRepository.save(person);
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
}
