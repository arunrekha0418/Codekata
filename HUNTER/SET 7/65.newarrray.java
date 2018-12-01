package guvihunter;

import java.util.Scanner;

public class Set7_65 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,k,i,count=0;
		System.out.println("ENTER THE SIZE OF THE ARRAY:");
		n=in.nextInt();
		System.out.println("ENTER THE k ELEMENT:");
		k=in.nextInt();
		System.out.println("ENTER THE ARRAY ELEMENTS:");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				a[i]='*';
				count++;
			}
		}
		if(count==n)
			System.out.println("EMPTY");
		else
		{
			for(i=0;i<n;i++)
			{
				if(a[i]!='*')
					System.out.print(a[i] + " " );
			}
		}
in.close();

	}

}
