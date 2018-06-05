//66.o print the array elements which are repeated for K times...

import java.util.*;
class repeatk
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,k,count,j;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE  ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("ENTER THE REPEATATIVE VALUE:");
k=in.nextInt();
System.out.println("THE  ARRAY ELEMENTS WHICH ARE REPEATED FOR k TIMES ARE:");

for(i=0;i<n;i++)
{
count=1;
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
count++;
}
if(count==k)
System.out.print(a[i] + " ");
}
}}
