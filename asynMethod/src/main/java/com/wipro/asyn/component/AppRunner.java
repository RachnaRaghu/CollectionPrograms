package com.wipro.asyn.component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wipro.asyn.model.UserJob;
import com.wipro.asyn.service.GitHubLookupService;

@Component
public class AppRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

	private final GitHubLookupService gitHubLookupService;

	public AppRunner(GitHubLookupService gitHubLookupService) {
		this.gitHubLookupService = gitHubLookupService;
	}

	@Override
	public void run(String... args) throws Exception {
		// Start the clock
		long start = System.currentTimeMillis();

		List<CompletableFuture<String>> list = new ArrayList<>();

		CompletableFuture<String> page1 = null;
		// Kick of multiple, asynchronous lookups

		for (int i = 0; i < 20; i++) {

			page1 = gitHubLookupService.findUser("Approach 1");
			list.add(page1);

		}
		// Wait until they are all done
		CompletableFuture.allOf(list.toArray(new CompletableFuture[0])).join();
		// Print results, including elapsed time
		logger.info("Approach 1 : Elapsed time: " + (System.currentTimeMillis() - start));
		
		

		// Second Approach		
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 20; i++) {
			gitHubLookupService.findUser2("Approach 2");
		}
		logger.info("Approach 2 : Elapsed time: " + (System.currentTimeMillis() - start1));

		
		
		// Third Approach
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 20; i++) {
			gitHubLookupService.findUser1("Approach 3");
		}
		logger.info("Approach 3 : Elapsed time: " + (System.currentTimeMillis() - start2));

		
		// Fourth Approach
		long start3 = System.currentTimeMillis();
		List<String> joblist = new ArrayList<>();
		ExecutorService executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(25);
		Future<String> result = null;
		for (int i = 0; i < 20; i++) {
			UserJob job = new UserJob("Approach 4 ExecutorService");
			result = executor.submit(job);
			joblist.add(result.get());
		}
		logger.info("Approach 4 : Elapsed time: " + (System.currentTimeMillis() - start3));

	}

}