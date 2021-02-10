package main.syncMethod.sankar;

/*if you declare any method as synchronized, it is known as synchronized method
 * Synchronized is used to lock an object for any shared resource.
 * When a thread invoks a synchronized method , it automatically acquiresthe lock for that 
 * object and releases it when the thread complets its task.
 * 
 */

class SyncMethodTable{
	public synchronized void displayTable(int tableNo) throws InterruptedException{
		System.out.println("I am going to print table");
		for(int i=1;i<5;i++) {
			System.out.println(tableNo + "*" + " " +i+ "=" +tableNo * i );
			Thread.sleep(500);
		  }
		System.out.println("I have finished printing the table");
	}
}
class SyncMethodThread1 extends Thread {
	SyncMethodTable table;
	public SyncMethodThread1(SyncMethodTable table) {
		this.table = table;
	}
	@Override
	public void run() {
		try {
			table.displayTable(2);
		}
		catch(InterruptedException ex){
			System.out.println(ex);
		}
	}
}

class SyncMethodThread2 extends Thread {
	SyncMethodTable table;
	public SyncMethodThread2(SyncMethodTable table) {
		this.table = table;
	}
	@Override
	public void run() {
		try {
			table.displayTable(3);
		}
		catch(InterruptedException ex){
			System.out.println(ex);
		}
	}
}
public class MainSyncClass {
	
	public static void main(String[] args) {
		SyncMethodTable table = new SyncMethodTable();
		SyncMethodThread1 thread1 = new SyncMethodThread1(table);
		SyncMethodThread2 thread2 = new SyncMethodThread2(table);
		thread1.start();
		thread2.start();
		
	}
}
