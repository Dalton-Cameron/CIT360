package test;

public class MyClass extends Thread{
	public void run(){
		for(int i=0; i<3;i++)
			System.
			out.println("Thread id:" + Thread.currentThread().getName());
		try{
			Thread.currentThread().sleep(100);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

public static void main(String[] args){
	for (int threadCnt=0; threadCnt<3;threadCnt++){
		MyClass aMyClass = new MyClass();
		aMyClass.start();
	}
	
}
}