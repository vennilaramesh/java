package javacore;

import java.util.Scanner;

public class TernaryOperatorForFourNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		max=(a>b)?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d));
		System.out.println("largest of 4 number is="+max);
		

	}

}
