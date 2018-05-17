//10.find wether the array is the subset of another array...

import java.util.Scanner;
class subset
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n,m,count=0;
System.out.println("ENTER THE SIZE OF TWO ARRAYS");
n=in.nextInt();
m=in.nextInt();
int a[]=new int[n];
int b[]=new int[m];
System.out.println("ENTER THE a ARRAY ELEMENTS");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("ENTER THE b ARRAY ELEMENTS");
for(j=0;j<m;j++)
{
b[j]=in.nextInt();
}
for(j=0;j<m;j++)
{
for(i=0;i<n;i++)
{
if(b[j]==a[i])
count++;
}}
if(count==m)
System.out.println("b IS THE SUBSET OF a");
else
System.out.println("b IS NOT THE SUBSET OF a");
}}
