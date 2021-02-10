package main.group.sankar;

import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * java convenient way to group multiple threads in a single object.
 * In such way we can suspend , resume or intrrupt  group of threads by a single method call  
 */
class SampleThread implements Runnable{

	@Override
	public void run() {
	   try {
	     Thread.sleep(1000);
		}
	   catch(InterruptedException ex ) {
	      Logger.getLogger(SampleThread.class.getName()).log(Level.SEVERE,null,ex);
			  }
		  }
	}
	
public class GroupThreadmainclass {
	public static void main(String[] args) {
	SampleThread samplethread = new SampleThread();
	ThreadGroup projectX = new ThreadGroup("projectX");
	/* create a new thread group. The parent of this new group is the specified thread group 
	 */
	ThreadGroup UIteam = new ThreadGroup(projectX,"UIteam");
	ThreadGroup Backendteam = new ThreadGroup(projectX,"Backendteam");
	
	Thread t1  = new Thread (projectX,samplethread,"project X Manager");
	Thread t2  = new Thread (UIteam,samplethread,"UIteam Member - raja");
	Thread t3  = new Thread (UIteam,samplethread,"UIteam Member - sathish");
	Thread t4  = new Thread (UIteam,samplethread,"UIteam Member - kumar");

	Thread t5  = new Thread (Backendteam,samplethread,"Backend Team Member - suman");
	Thread t6  = new Thread (Backendteam,samplethread,"Backend Team Member - ragul");
	Thread t7  = new Thread (Backendteam,samplethread,"Backend Team Member - kartick");
	Thread t8  = new Thread (Backendteam,samplethread,"Backend Team Member - magesh");
	 t1.start();
	 t2.start();
	 t3.start();
	 t4.start();
	 t5.start();
	 t6.start();
	 t7.start();
	 t8.start();
     
	 System.out.println("Thread Group  project X thread count ="+projectX.activeCount());
	 System.out.println("Thread Group  project X UIteam thread count ="+UIteam.activeCount());
	 System.out.println("Thread Group  project X Backend team thread count ="+Backendteam.activeCount());
	 
	 System.out.println("Thread Group  project X active group count ="+projectX.activeGroupCount());
	 System.out.println("Thread Group  project X UIteam active group count ="+UIteam.activeGroupCount());
	 System.out.println("Thread Group  project X Backend team active group count ="+Backendteam.activeGroupCount());
	 
	 System.out.println("Thread Group  project X name ="+projectX.getName());
	 System.out.println("Thread Group  project X UIteam name ="+UIteam.getName());
	 System.out.println("Thread Group  project X Backend team name ="+Backendteam.getName());
	 
	 System.out.println("Thread Group  project X parent ="+projectX.getParent().getName());
	 System.out.println("Thread Group  project X UIteam parent ="+UIteam.getParent().getName());
	 System.out.println("Thread Group  project X Backend team parent ="+Backendteam.getParent().getName());
	 
	 //projectX.destroy();
	}  
}
