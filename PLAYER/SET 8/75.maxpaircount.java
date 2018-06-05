//75.to count the pair having the cond of a[i]<a[j]...

import java.util.*;
class maxpair
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,k,count=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
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
count++;
}
}
System.out.println("THE PAIR COUNT IS  "  +  count);
}}
