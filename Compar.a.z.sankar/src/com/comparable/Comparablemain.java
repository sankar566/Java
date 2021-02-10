package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.comparator.Namecomparator;
import com.comparator.Student;

public class Comparablemain {
	
		public static void main(String args[]) {
			ArrayList a1 = new ArrayList();
			a1.add(new Studentcomparable(108,"vijay",23));
			a1.add(new Studentcomparable(106,"ajay",27));
			a1.add(new Studentcomparable(107,"jai",21));
			a1.add(new Studentcomparable(106,"Manoji",22));
			a1.add(new Studentcomparable(105,"babu",21));
			a1.add(new Studentcomparable(109,"kartick",22));
			a1.add(new Studentcomparable(104,"jai",21));
			a1.add(new Studentcomparable(106,"ziyath",24));
			a1.add(new Studentcomparable(111,"saran",21));
			a1.add(new Studentcomparable(112,"rames",22));
			a1.add(new Studentcomparable(103,"ramu",24));
			a1.add(new Studentcomparable(113,"sanjith",23));
			a1.add(new Studentcomparable(102,"rameshwaran",22));
			
			System.out.println("sort by age......");
			
			Collections.sort(a1);
			Iterator itr = a1.iterator();
			while (itr.hasNext()) {
				Studentcomparable st = (Studentcomparable		) itr.next();
				System.out.println(st.rollno+ "        " +st.name +"        "+st.age);
			}
			
			
		}

}
