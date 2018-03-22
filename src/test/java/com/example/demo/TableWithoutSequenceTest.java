package com.example.demo;

import com.example.demo.repository.TestWithoutSequenceRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TableWithoutSequenceTest {

    @Autowired
    private TestWithoutSequenceRepository testWithoutSequenceRepository;

    @Test
    public void saveEntity() {
//        TestWithoutSequence entity = new TestWithoutSequence("name");
//        testWithoutSequenceRepository.save(entity);
    }
}
