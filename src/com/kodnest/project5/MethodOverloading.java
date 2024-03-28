package com.kodnest.project5;
import java.util.Scanner;
class MethodOverloading {
	public static void main(String[] args) {
		System.out.println("enter ur choice");
		Scanner sc=new Scanner(System.in);
		System.out.println("press 0 for single chai");
		System.out.println("press 1 for double chai");
		System.out.println("press 2 for masala chai chai");
		int a=sc.nextInt();
		if(a==0) {
		getBill();
		
	}
		
		if(a==1) {
			getBill(4,40.5);
			
		}
		
		if(a==2) {
			getBill(4,"masala chai");
			
		}
	}
	static void getBill() {
		System.out.println("bill 1");
	}
	 
	static void getBill(int a,double b) {
		System.out.println("bill 2");
	}
	
	static void getBill(int quantity,String type) {
		System.out.println("bill 3");
	}
	
	static void getBill(double a, int b) {
		System.out.println("bill 4");
	}
	

}
