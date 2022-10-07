package practice2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public class ThreadClass{
	public static void main(final String[] args)throws InterruptedException {
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(new Task());
		ThreadPoolExecutor pool =(ThreadPoolExecutor)executor;
		pool.shutdown();
		
	}

static class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Long duration = (long) (Math.random()*10);
			System.out.println("Running Task");
			TimeUnit.SECONDS.sleep(duration);
			System.out.println("Task Completed");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
}