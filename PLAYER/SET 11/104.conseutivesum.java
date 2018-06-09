//104.to print the sum of the consecutive pairs...

import java.util.*;
class conssum
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,sum=0;
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
sum=sum+(a[i]+a[j]);
}
System.out.println(sum);
}}
