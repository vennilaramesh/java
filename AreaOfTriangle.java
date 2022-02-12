package javacore;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double breadth,height,area;
		System.out.println("enter the breadth:");
		Scanner sc=new Scanner(System.in);
		breadth=sc.nextDouble();
		System.out.println("enter the height:");
		height=sc.nextDouble();
		area=(height*breadth)/2;
		System.out.println("Area is:"+area);

	}

}
