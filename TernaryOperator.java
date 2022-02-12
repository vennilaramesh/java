package javacore;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values:");
		i=sc.nextInt();
		j=sc.nextInt();
		k=sc.nextInt();
		max=(i>j)?(i>k?i:k):(j>k?j:k);
		System.out.println("largest of 3 number is="+max);

	}

}
