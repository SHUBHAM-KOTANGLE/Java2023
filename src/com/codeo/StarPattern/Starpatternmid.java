package com.codeo.StarPattern;

public class Starpatternmid {
	public static void main(String[] args) {
		System.out.println("-------------------------------------------9");
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
			for(int i=1;i<=4;i++) 
			{
			
			for(int l=1;l<=i;l++) 
			{
				System.out.print(" ");
			}
			for(int m=3;m>=i;m--) 
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------10");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=2;j<=i;j++) 
			{
				System.out.print(" ");
			}
//			for(int k=1;k)
//			{
//				
//			}
			System.out.println("*");
			
		}

		System.out.println("-------------------------------------------11");
		
		
		
		
		
		System.out.println("-------------------------------------------12");
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 4; j>= i; j--) 
			{
				System.out.print("*");
			}
			for (int k = 2; k <= i; k++) 
			{
				System.out.print(" ");
			}
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
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			for (int k = 3; k >= i; k--) 
			{
				System.out.print(" ");
			}
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
