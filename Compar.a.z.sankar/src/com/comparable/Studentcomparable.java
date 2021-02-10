package com.comparable;

public class Studentcomparable implements Comparable {

	int rollno;
	String name;
	int age;
	Studentcomparable(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}
	@Override
	public int compareTo(Object obj) {
		Studentcomparable st = (Studentcomparable) obj;	
		if(age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
	
}
