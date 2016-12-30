package com.cadence.bench;

public class Strings {

	public static void main(String str[]){
		String s1="abc";
		String s2="abc";
		String s12="abc";

		String s3=new String("ccd");
		String s4=new String("ccD");


		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3==s4);
		System.out.println(s1==s2);
		System.out.println(s1==s12);
		System.out.println(s1.equals(s2));
	}

}
