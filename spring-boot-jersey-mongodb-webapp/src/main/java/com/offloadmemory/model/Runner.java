package com.offloadmemory.model;

import org.springframework.data.annotation.Id;

public class Runner {

	@Id
	String id;
	int runnerId;
	String runnerName;
	
	public int getRunnerId() {
		return runnerId;
	}
	public void setRunnerId(int runnerId) {
		this.runnerId = runnerId;
	}
	public String getRunnerName() {
		return runnerName;
	}
	public void setRunnerName(String runnerName) {
		this.runnerName = runnerName;
	}
}
