package test;

public class SimpleRunnable implements Runnable {
 public void run(){
	 for(int i =0;i<3;i++){
		 System.out.println("Thread ID: "+ Thread.currentThread().getName());
		 try {
			 Thread.currentThread().sleep(100);
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	 }
 }
}
