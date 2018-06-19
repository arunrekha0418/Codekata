//136.to find the K value and its occurance

import java.util.*;
class finding
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,count=0,k,i;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER THE ARRAY ELEMENTS:");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("ENTER THE k VALUE:");
k=in.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==k)
count++;
}
if(count==0)
System.out.println("NO , THE k VALUE IS NOT PRESENT IN THE ARRAY,0");
else
System.out.println("YES , THE k VALUE IS  PRESENT IN THE ARRAY," + count);
}}
