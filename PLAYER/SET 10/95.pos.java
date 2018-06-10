//95.to print the array element after the position...

import java.util.*;
class pos
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n,k,pos,l=0;
String a;
System.out.println("ENTER THE INPUT:");
a=in.next();
n=a.length();
char ch1[]=a.toCharArray();
char ch2[]=new char[n];
System.out.println("ENTER THE POSITION:");
pos=in.nextInt();
for(i=0;i<n;i++)
{
if(i==pos-1)
{
for(i=pos-1;i<n;i++)
{
ch2[l]=ch1[i];
l++;
}
}
}
System.out.println("ENTER THE KEY ELEMENT TO PRINT AFTER THE POSITION:");
k=in.nextInt();
for(j=0;j<l;j++)
{
	if(j==k)
	System.out.println(ch2[j]);
}
}}
