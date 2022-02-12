package javacore;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double side,area;
		System.out.println("enter a side of the square:");
		Scanner s=new Scanner(System.in);
		side=s.nextDouble();
		area=side*side;
		System.out.println("Area is:"+area);
	}

}
