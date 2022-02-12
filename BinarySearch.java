package javacore;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c,number,item,array[],first,last,middle;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements:-");
		number=sc.nextInt();
		array=new int[number];
		System.out.println("enter "+number+" integers:-");
		for(c=0;c<number;c++)
			array[c]=sc.nextInt();
		System.out.println("enter the search element:-");
		item=sc.nextInt();
		first=0;
		last=number-1;
		middle=(first+last)/2;
		while(first<=last) 
		{
			if(array[middle]<item)
				first=middle+1;
			else if(array[middle]==item)
			{
				System.out.println(item+"found at location"+(middle+1)+".");
				break;
			}
			else
			{
				last=middle-1;
			}
			middle=(first+last)/2;
		}
		if(first>last)
			System.out.println(item+"is not found.");
			
		}
	}


