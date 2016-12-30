package com.cadence.bench;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class Iterators {
	HashSet set=new HashSet();
	
	int i=5;
	public static void main(String str[])
	{
		
		ArrayList<Integer> aL=new ArrayList<Integer>();
		aL.add(333);
		aL.add(444);
		aL.add(555);
		aL.add(555);
		aL.add(null);
		//aL.add(null);
		//aL.addAll("abcd");
		//System.out.println(i);
		System.out.println("printing ArrayList aL " +aL);
		System.out.println("size of ArrayList aL is " +aL.size());
		System.out.println("Does aL contains 555 " +aL.contains(555));
		System.out.println("printing value at given index " +aL.get(4));
		System.out.println("printing output of getClass " +aL.getClass());
		System.out.println("Printing index of given element " +aL.indexOf(555));
		System.out.println("printing view of value stored between given index " +aL.subList(2, 4));
		Iterator<Integer> itr;
		itr=aL.iterator();
		System.out.println("printing the values stored in aL using iterator ");
		Iterators it=new Iterators();
		it.test();
		while(itr.hasNext()){
			System.out.print(itr.next());
			System.out.print(",");

		}
	}
	public void test(){
		i=6;
		System.out.println("value of i in test method run " +this.i);
		A a=new A();
		a.test2();
	}


	public class A extends Iterators{
		int i=8;
		public void test2(){
			//i=7;
			System.out.println("executing test2 method under class A ");
			System.out.println("test2 value of i with super keyword " +super.i);
			System.out.println("test2 value of i with this keyword " +this.i);
			System.out.println("test2 value of i " +i);
		}

	}
}


