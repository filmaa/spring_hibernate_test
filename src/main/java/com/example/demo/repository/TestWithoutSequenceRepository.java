package com.example.demo.repository;

import com.example.demo.entity.TestWithoutSequence;

import org.springframework.data.repository.CrudRepository;

public interface TestWithoutSequenceRepository extends CrudRepository<TestWithoutSequence, Long> {

}
