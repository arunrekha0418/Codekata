//144.to print the array elements which are divisible by their previous element

import java.util.*;
class prediv
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER  THE ARRAY ELEMENTS:");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0,j=i+1;i<n&&j<n;i++,j++)
{
if(a[j]%a[i]==0)
System.out.print(a[j] + " ");
}
}}
