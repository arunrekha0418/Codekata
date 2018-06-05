//71.to print the maximum number when compared with 2 consecutive nos...

import java.util.*;
class maxcon
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("THE CONSECUTIVE MAX ELEMENTS ARE:");
for(i=0,j=i+1;i<n&&j<n;i++,j++)
{
if(a[i]>a[j])
System.out.print(a[i] + " ");
else
System.out.print(a[j] + " ");
}
}}

