//93.to swap the adjacent nos

import java.util.*;
class swapadj
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,t;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER  THE ARRAY ELEMENTS:");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0,j=i+1;i<n&&j<n;i=i+2,j=j+2)
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
for(i=0;i<n;i++)
{
System.out.print(a[i] + " ");
}
}}
