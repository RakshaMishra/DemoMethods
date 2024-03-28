package com.kodnest.project5;
import java.util.Scanner;

public class Doubt2 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		int c=	add();
		System.out.println(c);

	}

	static int add()
	{  
		int a=sc.nextInt();
		int b=sc.nextInt();
		int s=a+b;
		System.out.println(s);
		return s;
	}

}
