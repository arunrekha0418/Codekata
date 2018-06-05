//73.to find the position of k element...

import java.util.*;
class search1
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,k,pos=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("ENTER THE k ELEMENT:");
k=in.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==k)
pos=i;
}
System.out.println("THE  "  + k +  "  IS FOUND AT : " + (pos+1));
}}
