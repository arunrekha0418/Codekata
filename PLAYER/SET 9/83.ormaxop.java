//83.to print the result of OR operation of the array elements...

import java.util.*;
class ormaxop
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,res=0;
System.out.println("ENTER THE SIZE OF THE ARRAY :");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE SIZE OF THE ARRAY :");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
res=res+(a[i] | a[j]);
}
}
System.out.println("THE RESULT OF and OPERATION IS " + res);
}}
