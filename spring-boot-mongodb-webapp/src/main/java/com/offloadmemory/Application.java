package com.offloadmemory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.offloadmemory.model.Runner;
import com.offloadmemory.repository.RunnerRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private RunnerRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		repository.deleteAll();

		// save a couple of customers
		repository.save(new Runner(1, "Gilli"));
		repository.save(new Runner(2, "Haddin"));
		
	}
}
