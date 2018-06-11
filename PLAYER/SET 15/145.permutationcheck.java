//145.to check wether the array contains all the elements upto the given N value

import java.util.*;
class perche
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,count=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER  THE ARRAY ELEMENTS:");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=1;i<=n;i++)
{
for(j=0;j<n;j++)
{
if(i==a[j])
count++;
}
}
if(count==n)
System.out.println("YES ,THE ARRAY CONTAINS ALL THE ELEMENTS UPTO nTH VALUE");
else
System.out.println("NO ,THE ARRAY DOESN'T CONTAINS ALL THE ELEMENTS UPTO nTH VALUE");
}}
