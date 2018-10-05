package guvihunter;

import java.util.Scanner;

public class Set6_57 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,i,j,count;
		System.out.println("ENTER THE NO.OF.ELEMENTS");
		n=in.nextInt();
		int a[]=new int[n];
		System.out.println("ENTER THE ELEMENTS");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
for(i=0;i<n;i++)
{
	count=1;
	for(j=i+1;j<n;j++)
	{
		if(a[i]==a[j]) {
			count++;
			a[j]='*';
		}
	}
	//System.out.println(count);
	if(count==1&&a[i]!='*')
	{
		System.out.println(a[i]);
		break;
	}
}
	}

}
