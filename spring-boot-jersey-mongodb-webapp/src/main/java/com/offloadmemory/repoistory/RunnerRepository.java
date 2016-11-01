package com.offloadmemory.repoistory;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.offloadmemory.model.Runner;

public interface RunnerRepository extends MongoRepository<Runner, String>{
	List<Runner> findAll();
	Page<Runner> findAll(Pageable pageable);
	Runner findByRunnerId(int runnerId);
	List<Runner> deleteByRunnerId(int runnerId);
	List<Runner> deleteByRunnerName(String runnerName);
}
