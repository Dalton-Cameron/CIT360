package test;
//This is code that shows how runnables work. 
class MyRunnableThread implements Runnable{
	 
    public static int myCount = 0;
    public MyRunnableThread(){
         
    }
    public void run() {
        while(MyRunnableThread.myCount <= 20){
            try{
                System.out.println("Example Thread: "+(++MyRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException excp1) {
                System.out.println("Exception in thread: "+excp1.getMessage());
            }
        }
    }
}


public class Runnables {
    public static void main(String a[]){
        System.out.println("This Starts the Main Thread>");
        MyRunnableThread runnablethread = new MyRunnableThread();
        Thread t = new Thread(runnablethread);
        t.start();
        while(MyRunnableThread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++MyRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException excp2){
                System.out.println("Exception in main thread: "+excp2.getMessage());
            }
        }
        System.out.println("This is the End of the Main Thread>");
    }
}

