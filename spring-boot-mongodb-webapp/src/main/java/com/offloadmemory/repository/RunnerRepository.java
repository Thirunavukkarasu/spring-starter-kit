package com.offloadmemory.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.offloadmemory.model.Runner;

public interface RunnerRepository extends MongoRepository<Runner, String>{
	Page<Runner> findAll(Pageable pageable);
	List<Runner> findAll();	
}