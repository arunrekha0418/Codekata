//65.to print the array elements which are lesser than N...

import java.util.*;
class lesser
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,k=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE  ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
Arrays.sort(a);
int t[]=new int[n];
for(i=0;i<n;i++)
{
if(a[i]<n)
{
t[k]=a[i];
k++;
}
}
System.out.println("THE ARRAY ELEMENTS LESSER THAN n ARE:");
for(i=0;i<k;i++)
{
System.out.print(t[i] +  " ");
}
}}
