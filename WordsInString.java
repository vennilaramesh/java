package javacore;

import java.util.Scanner;

public class WordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int c=1;
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				c++;
			}
		}
		System.out.println("no of words in the given line is:"+c);
		}

	}


