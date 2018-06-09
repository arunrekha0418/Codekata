//112.to print the count of subarrays...
//formula:(n*(n+1))/2...

import java.util.*;
class subarrcount
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,count=0,i;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER THE ARRAY ELEMENTS:");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
count=(n*(n+1))/2;
System.out.println(count + " SUBARRAYS CAN BE FORMED");
}}
