//135.half array elements ascending and half desending arrangements

import java.util.*;
class asdec
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,t1,t2,k1=0,k2=0,m=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
m=n/2;
int a[]=new int[n];
for(i=0;i<n;i++)
{
	a[i]=in.nextInt();
	
}

for(i=0;i<m;i++)
{
	for(j=i+1;j<m;j++)
	{
		if(a[i]>a[j])
		{
			t1=a[i];
			a[i]=a[j];
			a[j]=t1;
		}
	}
}
for(i=m;i<n;i++)
{
	for(j=i+1;j<n;j++)
	{
		if(a[i]<a[j])
		{
			t2=a[i];
			a[i]=a[j];
			a[j]=t2;
		}
	}
}
for(i=0;i<n;i++)
{
	System.out.print(a[i] + " ");
}

}}
