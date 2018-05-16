//hunter-->set1
//2.find the higest combination of element with given array elements.

import java.util.Scanner;
class combo
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,t;
System.out.println("ENTER THE NO.OF ARRAY ELEMENTS:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]<a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}}
for(i=0;i<n;i++)
{
System.out.print(a[i]);
}
}}
