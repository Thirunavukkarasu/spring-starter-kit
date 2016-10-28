package com.offloadmemory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.offloadmemory.model.Runner;
import com.offloadmemory.repository.RunnerRepository;
import com.offloadmemory.service.RunnerService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(RunnerRepository runnerRepository, RunnerService runnerService) {
		return args ->{
			Runner runner = runnerRepository.findOne("1");
			
			System.out.println(runner.getRunnerName());
		};
	}
}
