//32.to find particular element in the array...


import java.util.*;
class key
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,k,count=0;
System.out.println("ENTER THE SIZE OF THE ARRAY");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE  ARRAY ELEMENTS");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("ENTER THE KEY ELEMENT");
k=in.nextInt();
for(i=0;i<n;i++)
{
if(k==a[i])
count=1;
}
if(count==1)
System.out.println("YES");
else
System.out.println("NO");
}}
