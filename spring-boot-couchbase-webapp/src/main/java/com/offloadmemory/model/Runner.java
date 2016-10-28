package com.offloadmemory.model;

import org.springframework.data.couchbase.core.mapping.Document;
import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class Runner {
	@Id
	private String id;
	
    @Field
	private long runnerId;
    
    @Field
	private String runnerName;
	
	public Runner() {
	}

	public Runner(String id, long runnerId, String runnerName) {
		this.id = id;
		this.runnerId = runnerId;
		this.runnerName = runnerName;
	}
	
	public Runner(Runner r) {
		this.id = r.getId();
		this.runnerId = r.getRunnerId();
		this.runnerName = r.getRunnerName();
	}	
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
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
