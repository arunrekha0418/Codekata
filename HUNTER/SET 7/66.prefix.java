package guvihunter;

import java.util.Scanner;

public class Set7_66 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,i,j,k,count,tcount=0;
		System.out.println("ENTER THE SIZE OF THE ARRAY: ");
		n=in.nextInt();
		String a[]=new String[n];
		System.out.println("ENTER THE  ARRAY ELEMENTS: ");
		for(i=0;i<n;i++)
		{
			a[i]=in.next();
		}
		System.out.println("ENTER THE PREFIX: ");
		String pre=in.next();
		char ch[]=pre.toCharArray();
		for(i=0;i<n;i++)
		{
			count=0;
			char ch1[]=a[i].toCharArray();
			for(j=0,k=0;j<ch.length;j++,k++)
			{
				if(ch[j]==ch1[k])
					count++;
			}
			if(count==ch.length)
				tcount++;
				
		}
		System.out.println("THE NO.OF.ARRAY ELEMENTS HAVING PREFIX : " + tcount);
		in.close();
	}

}
