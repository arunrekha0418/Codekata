//77.to print the maximum length of subarray of  continously increasing order...

import java.util.*;
class maxlen
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,k,count=1;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0,j=i+1;i<n&&j<n;i++,j++)
{
if(a[i]<a[j])
count++;
else
break;
}
System.out.println("THE MAXIMUM LENGTH IS " + count);
}}
