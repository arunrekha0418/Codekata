//29.to print the max sum of the array...

import java.util.*;
class maxsum
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,n,j=0,sum=0;
System.out.println("ENTER THE SIZE OF THE ARRAY");
n=in.nextInt();
System.out.println("ENTER THE ARRAY ELEMENTS");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
System.out.println(sum);
}}
