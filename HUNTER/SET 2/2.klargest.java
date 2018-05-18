//to find the kth largest element in the array

import java.util.Scanner;
class seclargest
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,k,t;
System.out.println("ENTER THE TOTAL NO.OF.ARRAY ELEMENTS");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("ENTER THE K VALUE TO FIND THE Kth LARGEST VALUE IN THE ARRAY:");
k=in.nextInt();
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
System.out.println("THE Kth LARGEST VALUE IN THE ARRAY IS:" + a[k-1]);

}}
