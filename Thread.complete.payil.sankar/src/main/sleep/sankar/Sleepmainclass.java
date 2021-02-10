package main.sleep.sankar;
 
/* The sleep method of Thread class is used to sleep a thread for the specified amount of time
 * 
 * Thread class sleep methods
 * public static void sleep(long milliseconds)throws InterruptedException
   public static void sleep(long milliseconds,int nanos)throws InterruptedException
 
  */
 
class Thread1 extends Thread{
	public static int counter=0;

	@Override
	public void run() {
	  for(int i=0;i<10;i++) {
		  System.out.println(" Thread 1 is going to sleep");
		  try {
			  Thread.sleep(1000);
		  }
		  catch(InterruptedException ex ) {
		   System.out.println("ex");
		  }
		  System.out.println(" Thread 1 is Wokeup ");
	  }
	}
}

class Thread2 extends Thread{
	public static int counter=0;

	@Override
	public void run() {
	  for(int i=0;i<10;i++) {
		  System.out.println(" Thread2 is going to sleep");
		  try {
			  Thread.sleep(1000);
		  }
		  catch(InterruptedException ex ) {
		   System.out.println("ex");
		  }
		  System.out.println(" Thread 2 is Wokeup ");
	  }
	}
}
public class Sleepmainclass {
	
	public static void main(String[] args) {
		//create a Thread instance
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		// Starting the Thread
		thread1.start();
		thread2.start();
		
	}

}
