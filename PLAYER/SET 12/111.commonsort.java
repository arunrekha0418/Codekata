//111.common array elements of two arrays

import java.util.*;
class commonsort
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int m,n,i,j;
System.out.println("ENTER THE ARRAY SIZES:");
m=in.nextInt();
n=in.nextInt();
int a[]=new int[m];
int b[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<m;i++)
{
a[i]=in.nextInt();
}
Arrays.sort(a);
for(i=0;i<n;i++)
{
b[i]=in.nextInt();
}
Arrays.sort(b);
System.out.print("THE COMMON ARRAY ELEMENTS IN SORTED ORDER :");
for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
	{
if(a[i]==b[j])
System.out.print(a[i] + " ");
	}
}
}}
