//78.to merge the 2 arrays in sorted order...

import java.util.*;
class merge
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,t,m;
int a[]=new int[20];
System.out.println("ENTER THE SIZE OF THE FIRST ARRAY:");
n=in.nextInt();
System.out.println("ENTER THE  FIRST ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("ENTER THE SIZE OF THE SECOND ARRAY:");
m=in.nextInt();
System.out.println("ENTER THE SECOND ARRAY ELEMENTS:");
for(i=n;i<n+m;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<(n+m)-1;i++)
{
	for(j=i+1;j<n+m;j++)
	{
		if(a[i]>a[j])
		{
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	}
}
for(i=0;i<m+n;i++)
{
System.out.print(a[i] + " ");
}
}}
