package com.wipro.asyn.model;

import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class UserJob implements Callable{
		
	String userjob = "userJob";
	
	public UserJob(String userjob){
		this.userjob = userjob;
		
	}
	
	private static final Logger logger = LoggerFactory.getLogger(UserJob.class);
	
	public String userJob(String userJob) throws InterruptedException {
		 logger.info("Looking up " + userJob);
		 Thread.sleep(1000L);
		
		 return "userjob";
		}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return userJob(userjob);
	}
	

}


