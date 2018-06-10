//108.to print the prefix sum array for the given array

import java.util.*;
class prefixsum
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,sum=0,k=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER  THE ARRAY ELEMENTS:");
int a[]=new int[n];
int b[]=new int[n];

for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum+a[i];
b[k]=sum;
k++;
}
for(i=0;i<k;i++)
{
System.out.print(b[i] + " ");
}
}}
