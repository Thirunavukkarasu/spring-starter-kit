package com.offloadmemory.repository;

import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.offloadmemory.model.Runner;

public interface RunnerRepository extends PagingAndSortingRepository<Runner, String>{
	@View(designDocument = "runner", viewName = "all")
	Page<Runner> findAll(Pageable pageable);
	Page<Runner> findAll();	
}
