//72.to print the maximum reached element (bitonic array) eg 1 2 3 2 1...ans:3.... 

import java.util.*;
class bitonic
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,max=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0,j=i+1;i<n&&j<n;i++,j++)
{
if((a[i]<a[j])||(a[i]==a[j]))
{}
else
{
max=a[i];
break;
}
}
System.out.println("THE MAXIMUM REACH IS " + max);
}}
