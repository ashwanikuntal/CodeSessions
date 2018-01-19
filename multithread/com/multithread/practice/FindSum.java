package com.multithread.practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FindSum{
	
	public static void main(String[] args) {
		
	    ExecutorService es = Executors.newFixedThreadPool(5);
	    java.util.concurrent.Future<Long> result = es.submit(new Sum());
	    try {
			System.out.println(result.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	    
	}
}

class Sum implements Callable<Long> {
	
	long sum;
	@Override
	public Long call() throws Exception {
		synchronized (this) {
			for(long i=1; i<=10; i++) {
				sum = sum + i;
			}
			return sum;
		}
	}
}
