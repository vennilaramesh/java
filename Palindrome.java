package javacore;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s,reverse="";
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		if(s.equals(reverse))
		{
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}

	}

}
