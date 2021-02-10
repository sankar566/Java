package com.Thread.Sankar;


class class_A extends Thread { 
	
	public void run() {
	for(int i=0;i<=5;i++) {
		if(i==2) yield();
		System.out.println("\n Thread from class A...." +i);
		 }
	System.out.println("\n Thread A  is Completed....." );
	}
	
}
class class_B extends Thread{ 
	public void run() {
		for(int i=0;i<=5;i++) {
			if(i==3) stop();
			System.out.println("\n Thread from class B...." +i);
			 }
		System.out.println("\n Thread B is Completed....." );
		}
	
}
class class_C extends Thread{
	
	public void run() {
		for(int i=0;i<=5;i++) {
			if(i==4) {
				System.out.println("System is going to  sleep 1000 ms");
				try {
					sleep(1000);
				}
				catch(Exception e){
				System.out.println("\n Error :" +e);	
				}
			}
			
		}
	}
}
public class MainClass {
	public static void main (String args[]) {
	
    class_A o1 = new class_A();
    class_B o2 = new class_B();
    class_C o3 = new class_C();
    System.out.println("\n Thread A is Started....");
    o1.start();
    System.out.println("\n Thread B is Started....");
    o2.start();
    System.out.println("\n Thread C is Started....");
    o3.start();
    System.out.println("\n  Main Thread is Completed ....");
	}
    
}
