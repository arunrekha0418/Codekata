//24.to check the pair whose sum value meets the target value...

import java.util.*;
class sumpair
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n,count=0,k;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE  ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("ENTER THE TARGET ELEMENT:");
k=in.nextInt();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]+a[j]==k)
count++;
}}
if(count!=0)
System.out.println("YES ,PAIR EXSISTS");
else
System.out.println("NO , PAIR EXSISTS");
}}
