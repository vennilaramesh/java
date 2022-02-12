package javacore;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int sum=0,number,digit;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value:");
    number=sc.nextInt();
    while(number>0)
    {
    	digit=number%10;
    	sum=sum+digit;
    	number=number/10;
    }
    System.out.println("sum is="+sum);
    	}

}
