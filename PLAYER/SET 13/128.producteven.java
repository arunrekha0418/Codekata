//128.to check the obtained product is even or odd

import java.util.*;
class proeven
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,pro=1;
System.out.println("ENTERH THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
pro=pro*a[i];
}
if(pro%2==0)
System.out.println("THE PRODUCT OBTAINED IS EVEN");
else
System.out.println("THE PRODUCT OBTAINED IS ODD");
}}
