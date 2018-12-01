package guvihunter;

import java.util.Scanner;

public class Set7_64 {
//to make segregation of the amount...
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,n,count=0;
		System.out.println("ENTER THE AMOUNT");
		a=in.nextInt();
		n=a;
		while(n>0)
		{
			if(n>=1000)
				n=n-1000;
				
			else if(n>=500&&n<1000)
				n=n-500;
				
			else if(n>=100&&n<500)
				n=n-100;
				
			else if(n>=50&&n<100)
				n=n-50;
				
			else if(n>=10&&n<50)
				n=n-10;
			
			else
				n=n-1;
						
			count++;
			
		}
System.out.println("THE SUM OF THE CURRENCY NOTES TO MAKE OPTIMAL ARE : " + count);
in.close();
	}

}
