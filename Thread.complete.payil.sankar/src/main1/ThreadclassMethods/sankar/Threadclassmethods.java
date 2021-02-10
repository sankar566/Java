package main1.ThreadclassMethods.sankar;

class NumericThread extends Thread{
	public static int counter=0;

	@Override
	public void run() {
	  for(int i=0;i<10;i++) {
		  counter=counter+1;
		  System.out.println(counter);
		  
	  }
	}
}
class AlphaThread extends Thread{
	public static char character='A';

	@Override
	public void run() {
		
	  for(int i=0;i<26;i++) {
		 
		  System.out.println(character);
		  character=(char)(character+1);
	  }
	}
}

public class Threadclassmethods {
	public static void main(String[]args)  {
		// create Thread instance 
		NumericThread numericthread = new NumericThread();
		AlphaThread alphathread = new AlphaThread();
		// start the thread 
		//During the step , the thread moves to New state to Runnable State
		numericthread.start();
		alphathread.start();
		// Get the state of the thread 
		System.out.println("Numericthread state = " +numericthread.getState());
		System.out.println("alphathread state = " +alphathread.getState());
	   // print the thread priority
		System.out.println("Numericthread priority = " +numericthread.getPriority());
		System.out.println("alphathread priority = " +alphathread.getPriority());
		// Get the thread Name 
		System.out.println("Numericthread Name = " +numericthread.getName());
		System.out.println("alphathread Name = " +alphathread.getName());
		// set the thread name 
		numericthread.setName("Numeric Thread");
		alphathread.setName("Alpha Thread");
		System.out.println("Numericthread Name = " +numericthread.getName());
		System.out.println("alphathread Name = " +alphathread.getName());
		// Get the current Thread 
		System.out.println("Current Thread Name = " +Thread.currentThread().getName());
		// Get the Thread ID
		System.out.println("Numericthread ID = " +numericthread.getId());
		System.out.println("alphathread ID = " +alphathread.getId());
		// Get the State of the Thread 
		System.out.println("Numericthread State  = " +numericthread.getState());
		System.out.println("alphathread State  = " +alphathread.getState());
		
		if(numericthread.isAlive()) {
			System.out.println("Numeric Thread is Alive ");
		}
		else{
			System.out.println("Numeric Thread is not  Alive ");	
		}
        if(alphathread.isAlive()) {
        	System.out.println("Alpha Thread is Alive ");
		}
		else{
			System.out.println("Alpha Thread not is Alive ");
		}

	}

}
