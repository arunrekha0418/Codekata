//76.to find the odd element...

import java.util.*;
class oddone
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,k,evecount=0,oddcount=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
if(a[i]%2==0)
evecount++;
else
oddcount++;
}
if(evecount==n-1)
{
for(i=0;i<n;i++)
{
if(a[i]%2!=0)
System.out.println("THE ODD ONE IS "  +  a[i]);
}
}
else
{
for(i=0;i<n;i++)
{
if(a[i]%2==0)
System.out.println("THE ODD ONE IS "  +  a[i]);
}
}
}}
