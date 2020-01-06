package Inheritance;

import java.util.Scanner;

public class classA {

	  int c;
	private Scanner sc;
	  void add(int a,int b){
	    c=a+b;
	    System.out.println(c);
	  }
	  void add(){
	    sc = new Scanner(System.in);
	    System.out.println("enter a");
	    int a=sc.nextInt();
	    System.out.println("enter b");
	    int b=sc.nextInt();
	    System.out.println("c="+(a+b));
	    }
	  void Print(){
		  System.out.println("Parent class hello");
	  }
	  
	}



		

