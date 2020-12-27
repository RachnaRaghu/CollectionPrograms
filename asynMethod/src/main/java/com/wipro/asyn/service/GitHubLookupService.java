package com.wipro.asyn.service;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitHubLookupService {
	
	private static final Logger logger = LoggerFactory.getLogger(GitHubLookupService.class);
	 private final RestTemplate restTemplate;

	  public GitHubLookupService(RestTemplateBuilder restTemplateBuilder) {
	    this.restTemplate = restTemplateBuilder.build();
	  }

	  @Async
	  public CompletableFuture<String> findUser(String user) throws InterruptedException {
	    logger.info("Looking up " + user);
	    Thread.sleep(1000L);
	    return CompletableFuture.completedFuture("user");
	  }
	  
	  @Async
	  public void findUser2(String user) throws InterruptedException {
	    logger.info("Looking up " + user);
	    Thread.sleep(1000L);
	    
	  }
	  
	  public void findUser1(String user) throws InterruptedException {
		    logger.info("Looking up " + user);
		    Thread.sleep(1000L);
		 }


	}
	
	
