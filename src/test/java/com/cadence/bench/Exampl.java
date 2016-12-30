package com.cadence.bench;

public class Exampl {
	int x=1;
	int y=2;
	void m1(){
		System.out.println("example m1 x " +x);
		System.out.println("example m1 y " +y);
	}
}

class Sample extends Exampl{
	int x=11;
	int y=22;
	void m2(){
		//x=111;
		//y=222;
		
		Sample s2=new Sample();
		Exampl e2=new Exampl();
		System.out.println("------------------------------------");
		System.out.println("example m2 x " +x);
		System.out.println("example m2 y " +y);

		System.out.println("------------------------------------");
		System.out.println("value of x with this keyword " +this.x);
		System.out.println("value of y  with this keyword " +this.y);
		
		System.out.println("------------------------------------");
		System.out.println("value of x with s2 object object " +s2.x);
		System.out.println("value of y  with s2 object " +s2.y);
		

		System.out.println("------------------------------------");
		System.out.println("value of x with super keyword " +super.x);
		System.out.println("value of y with super keyword " +super.y);
		

		System.out.println("------------------------------------");
		System.out.println("value of x with e2 object " +e2.x);
		System.out.println("value of y with e2 object " +e2.y);
		
	}
	
	public static void main(String str[]){
		Sample s=new Sample();
		s.m2();
	}
}
