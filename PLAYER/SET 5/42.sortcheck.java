//42.to check wether the given array elements are in sorted order

import java.util.*;
class cmpn
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n,count=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER THE ARRAY ELEMENTS:");
int a[]=new int [n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0,j=i+1;i<n&&j<n;i++,j++)
{
if(a[i]<a[j])
count++;
}
if(count==n-1)
System.out.println("THE GIVEN ARAY ELEMENTS ARE IN SORTED ORDER");
else
System.out.println("THE GIVEN ARAY ELEMENTS ARE NOT IN SORTED ORDER");
}}
