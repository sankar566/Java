package main.join.sankar;

/*
 * join() method waits for a thread to die 
 */
 
class ThreadJoin1 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("t1=" +i);
		  }
	}
}

class ThreadJoin2 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("t2=" +i);
		  }
	}
}

class ThreadJoin3 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("t3=" +i);
		  }
	}
}

public class Joinmainclass {
	public static void main(String[]args)  {
		ThreadJoin1 threadjoin1 = new ThreadJoin1();
		ThreadJoin2 threadjoin2 = new ThreadJoin2();
		ThreadJoin3 threadjoin3 = new ThreadJoin3();
		threadjoin1.start();
		try {
			threadjoin1.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		threadjoin2.start();
		threadjoin3.start();
	}
}
