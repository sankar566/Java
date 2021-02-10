package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Comparatorexsample {
	public static void main(String args[]) {
		ArrayList a1 = new ArrayList();
		a1.add(new Student(101,"vijay",23));
		a1.add(new Student(106,"ajay",27));
		a1.add(new Student(105,"jai",21));
		a1.add(new Student(106,"Manoji",22));
		a1.add(new Student(105,"babu",21));
		a1.add(new Student(106,"kartick",22));
		a1.add(new Student(105,"jai",21));
		a1.add(new Student(106,"ziyath",24));
		a1.add(new Student(105,"saran",21));
		a1.add(new Student(106,"rames",22));
		a1.add(new Student(105,"ramu",24));
		a1.add(new Student(106,"sanjith",23));
		a1.add(new Student(105,"rameshwaran",22));
		
		System.out.println("sort by name......");
		
		Collections.sort(a1,new Namecomparator());
		Iterator itr = a1.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno+ "        " +st.name +"        "+st.age);
		}
		
		System.out.println("sort by age......");
		Collections.sort(a1,new Agecomparator());
		Iterator itr2 = a1.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			System.out.println(st.rollno+ " " +st.name +" "+st.age);
		}
		
	}

}
