package com.javacodegeeks.snippets.enterprise.quartzexample.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.javacodegeeks.snippets.enterprise.quartzexample.service.ByeService;

public class ByeJob implements Job{ 
	
	private ByeService bs = new ByeService();
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		bs.sayGoodbye();
	} 
}