package com.javacodegeeks.snippets.enterprise.quartzexample.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.javacodegeeks.snippets.enterprise.quartzexample.service.HelloService;

public class HelloJob implements Job{ 
	
	private HelloService hs = new HelloService();
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		hs.sayHello();
		} 
}