//5.to print the maximum sum from the sub array..

import java.util.Scanner;
class subarray
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,mid,sum1=0,sum2=0;
System.out.println("ENTER THE SIZE OF ARRAY:");
n=in.nextInt();
mid=n/2;
//System.out.println(mid);
int a[]=new int[n];
System.out.println("ENTER THE FIRST SUBARRAY ELEMENTS:");
for(i=0;i<mid;i++)
{
	a[i]=in.nextInt();
	sum1=sum1+a[i];
}
System.out.println("ENTER THE SECOND SUBARRAY ELEMENTS:");
for(i=mid;i<n;i++)
{
	a[i]=in.nextInt();
	sum2=sum2+a[i];
}
if(sum1<sum2)
	System.out.println("THE MAXIMUM SUM IS FROM SECOND SUBARRAY AND THE SUM IS " + sum2);
else
	System.out.println("THE MAXIMUM SUM IS FROM FIRST SUBARRAY AND THE SUM IS " + sum1);

}}
