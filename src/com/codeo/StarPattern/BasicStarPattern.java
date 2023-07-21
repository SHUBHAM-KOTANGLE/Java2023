package com.codeo.StarPattern;

public class BasicStarPattern {

	public static void main(String[] args) {
System.out.println("-------------------------------------------1");
		
		for (int i = 1; i <= 4; i++) 
		{

			for (int k = 1; k <= i; k++) 
			{
				System.out.print("*");

			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------2");
		
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 5; j >= i; j--) 
			{
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println("-------------------------------------------3");
		
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 2; j <= i; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------4");
		
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

	}

}
