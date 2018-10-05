package guvihunter;

import java.util.Scanner;

public class Set6_53 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String a;
		int n,i,j,k;
		//System.out.println("ENTER THE STRING");
		a=in.nextLine();
		n=a.length();
		//System.out.println("ENTER THE KEY VALUE");
		k=in.nextInt();
		char ch[]=a.toCharArray();
		for(i=0;i<n;i++)
		{
			int t=i;
			if((n-i)>=k)
			{
			for(j=0;j<k;j++)
			{
				System.out.print(ch[t]);
				t++;
			}
			}
			System.out.print(" ");
		}
		in.close();
	}

}
