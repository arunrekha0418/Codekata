//61.to check wether the sum of the given array elements equals the Xth  element

import java.util.*;
class sumequ
{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
int n,x,i,j,count=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER THE ARRAY ELEMENTS:");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("ENTER THE KEY ELEMENT:");
x=in.nextInt();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]+a[j]==x)
count=1;
}
}
if(count==1)
System.out.println("YES");
else
System.out.println("NO");
}}
