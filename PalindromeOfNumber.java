package javacore;

import java.util.Scanner;

public class PalindromeOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,sum=0,temp,r;
		System.out.println("enter the value:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		temp=a;
		while(a>0)
		{
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}

	}

}
