//106.to print the array after removing duplicate elements...

import java.util.*;
class duprem
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,t,k=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER THE ARRAY ELEMENTS:");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
a[j]='*';
}
}
for(i=0;i<n;i++)
{
if(a[i]!='*')
{
System.out.print(a[i]);
}
System.out.print(" ");
if(i==n-1)
	break;
}
}} 
