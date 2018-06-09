//105.sort the given input array and print the index of new array based on the input array...

import java.util.*;
class sortindex
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,t,k=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER THE ARRAY ELEMENTS:");
int a[]=new int[n];
int b[]=new int[n];
int c[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
b[i]=a[i];
}
Arrays.sort(a);
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
	if(a[i]==b[j])
	{
		c[k]=j+1;
		k++;
	}
}
}
for(i=0;i<k;i++)
{
	System.out.print(c[i] + " ");
}

}}
