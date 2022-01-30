package javacore;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius,area;
		System.out.println("enter the radius:");
		Scanner a=new Scanner(System.in);
		radius=a.nextDouble();
		area=Math.PI*radius*radius;
		System.out.println("Area is:"+area);
		

	}

}
