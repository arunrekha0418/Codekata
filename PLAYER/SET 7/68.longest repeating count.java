//68.to print the longest sequence of repeating count...

import java.util.*;
class long3
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,k,count,max=0,j;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE  ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
count=1;
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
count++;
if(max<count)
max=count;
}}
System.out.println("THE LONGEST SEQUENCE OF THE REPETATION IN THE GIVEN ARRAY ELEMENTS IS " +  max);
}}
