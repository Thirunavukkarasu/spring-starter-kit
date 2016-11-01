package com.offloadmemory.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.offloadmemory.model.Runner;
import com.offloadmemory.repoistory.RunnerRepository;

@Component
@Path("/runners")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RunnerController {
	@Autowired
	RunnerRepository runnerRepository;
	
	/***
	 * Get all the MongoDB runner collection documents
	 * @param runner
	 * @return Page<Runner>
	 */	
	@GET
	public Page<Runner> getRunners(Pageable pageable){
		return runnerRepository.findAll(pageable);
	}
	
	/***
	 * Insert the MongoDB runner collection with the given runner details
	 * @param runner
	 * @return List<Runner>
	 */	
	@POST
	public List<Runner> saveRunner(Runner runner){
		runnerRepository.save(runner);
		return runnerRepository.findAll();
	}
	
	/***
	 * Update the MongoDB runner collection for the given runnerId
	 * @param runner
	 * @return List<Runner>
	 */
	@PUT
	public List<Runner> updateRunner(Runner runner){
		Runner existingRunner = runnerRepository.findByRunnerId(runner.getRunnerId());
		existingRunner.setRunnerName(runner.getRunnerName());
		runnerRepository.save(existingRunner);
		return runnerRepository.findAll();
	}
	
	/***
	 * Delete the MongoDB runner collection for the given runnerId
	 * @param runner
	 * @return List<Runner>
	 */
	@DELETE
	public List<Runner> deleteRunner(Runner runner){
		runnerRepository.deleteByRunnerId(runner.getRunnerId());
		return runnerRepository.findAll();
	}
}
