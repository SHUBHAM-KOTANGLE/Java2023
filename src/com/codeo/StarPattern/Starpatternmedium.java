package com.codeo.StarPattern;

public class Starpatternmedium {

	public static void main(String[] args) {
System.out.println("-------------------------------------------5");
		
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 3; j >= i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) 
			{
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = 1; i <= 4; i++) 
		{

			for (int l = 1; l <= i; l++) 
			{
				System.out.print(" ");
			}
			for (int m = 3; m >= i; m--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------------------------------------6");
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------7");
		
		for(int i=1;i<=4;i++) 
		{
			for(int j=3;j>=i;j--) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++) 
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		System.out.println("-------------------------------------------8");
		
		for(int i=1;i<=4;i++) 
		{
			for(int j=2;j<=i;j++) 
			{
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--) 
			{
				System.out.print("*");
			}
			for(int k=3;k>=i;k--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
