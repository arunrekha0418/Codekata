//63.to find the common elements for the given 2 arrays

import java.util.*;
class simi
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,k=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE FIRST ARRAY:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
int b[]=new int[n];
System.out.println("ENTER THE SECOND ARRAY:");
for(i=0;i<n;i++)
{
b[i]=in.nextInt();
}
int t[]=new int[n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i]==b[j])
{
t[k]=a[i];
k++;
break;
}
}}
System.out.println("THE COMMON ELEMENTS ARE:");
for(i=0;i<k;i++)
{
	for(j=i+1;j<k;j++)
	{
		if(t[i]==t[j])
			t[j]='*';
	}
}
for(i=0;i<k;i++)
{
if(t[i]!='*')
	System.out.print(t[i] + " ");
}



}}

