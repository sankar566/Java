package main.DeadLock.sankar;


public class DeadLockClass {

	 public static void main (String[] args) {
		 final String resourse1 = "sankar";
		 final String resourse2 = "prabhu";
		 //t1 tries to Lock resourse1 then resourse2
		 Thread t1 = new Thread() {
			 public void run() {
				 synchronized (resourse1) {
					System.out.println("Thread 1:locked resourse 1");
					try {
						Thread.sleep(100);
					}
					catch(Exception e ) {
						
					}
					synchronized (resourse2) {
						System.out.println("Thread 1:locked resourse 2");
					}
				}
			 }
			 
		 };
		 
		 //t2 tries to Lock resourse2 then resourse1
		 Thread t2 = new Thread() {
			 public void run() {
				 synchronized (resourse2) {
					System.out.println("Thread 2:locked resourse 2");
					try {
						Thread.sleep(100);
					}
					catch(Exception e ) {
						
					}
					synchronized (resourse1) {
						System.out.println("Thread 2:locked resourse 1");
					}
				}
			 }
			 
		 };
		 System.out.println("Exception over");
		 t1.start();
		 t2.start();
	 }
}
