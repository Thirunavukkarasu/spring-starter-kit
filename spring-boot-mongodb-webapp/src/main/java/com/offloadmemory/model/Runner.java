package com.offloadmemory.model;

import org.springframework.data.annotation.Id;

public class Runner {
	@Id
	private String id;
	
	private long runnerId;
	private String runnerName;
	
	public Runner() {
	}

	public Runner(long runnerId, String runnerName) {
		this.runnerId = runnerId;
		this.runnerName = runnerName;
	}
	
	public Runner(Runner r) {
		this.runnerId = r.getRunnerId();
		this.runnerName = r.getRunnerName();
	}	
	
	public long getRunnerId() {
		return runnerId;
	}
	
	public void setRunnerId(long runnerId) {
		this.runnerId = runnerId;
	}
	
	public String getRunnerName() {
		return runnerName;
	}
	
	public void setRunnerName(String runnerName) {
		this.runnerName = runnerName;
	}
}