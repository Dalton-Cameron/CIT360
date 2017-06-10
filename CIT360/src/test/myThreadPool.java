package test;

import java.util.concurrent.*;

public class myThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Executor anExecutor = Executors.newCachedThreadPool();
		for(int threadCount = 0; threadCount<4; threadCount++){
			SimpleRunnable myRunnable = new SimpleRunnable();
			anExecutor.execute(myRunnable);
		}
		try {
			Thread.sleep(5000);
			System.out.println("Done Sleeping");
			for(int threadCount = 0; threadCount < 3; threadCount++){
				SimpleRunnable aSimpleRunnable = new SimpleRunnable();
				anExecutor.execute(aSimpleRunnable);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
