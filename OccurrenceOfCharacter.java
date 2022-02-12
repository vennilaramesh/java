package javacore;

import java.util.Scanner;

public class OccurrenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		char l;
		int c=0;
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("enter the letter=");
		l=sc.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==l)
		c++;
		}
		System.out.println("character "+l+" occurred "+c+" times in the line");
		
	}

}
