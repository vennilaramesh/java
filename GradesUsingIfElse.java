package javacore;

import java.util.Scanner;

public class GradesUsingIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		System.out.println("enter the mark you got=");
		Scanner sc=new Scanner(System.in);
		mark=sc.nextInt();
		if(mark>=90 && mark<=100)
		{
			System.out.println("Grade A");
		}
		else if(mark>=60 && mark<=89)
		{
			System.out.println("Grade B");
		}
		else if(mark>0 && mark<=59)
		{
			System.out.println("Grade C");
		}
		else{
			System.out.println("Invalid");
		}
		

	}

}
