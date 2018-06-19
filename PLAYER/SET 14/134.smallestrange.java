//134.to find the smallest number of the array within the range...

import java.util.*;
class rangesml
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,l,r,j=0,k,t;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("ENTER THE RANGE:");
l=in.nextInt();
r=in.nextInt();
for(i=l-1;i<r;i++)
{
b[j]=a[i];
j++;
}
for(i=0;i<j;i++)
{
for(k=i+1;k<j;k++)
{
	if(b[i]>b[k])
	{
		t=b[i];
		b[i]=b[k];
		b[k]=t;
	}
}
}
//Arrays.sort(b);
System.out.println("THE SMALLEST NUMBER WITHIN THE RANGE IS " + b[0]);
}}
