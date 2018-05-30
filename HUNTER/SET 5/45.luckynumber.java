//45.to print wether the lucky number exsists in the given array...luckynumber=element*index


import java.util.*;
class lucky
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,n,lucky_no=1,j;
System.out.println("ENTER THE SIZE OF THE ARRAY");
n=in.nextInt();
System.out.println("ENTER THE  ARRAY ELEMENTS");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
lucky_no=i*a[i];
for(j=0;j<n;j++)
{
if(lucky_no==a[j])
{
System.out.println(lucky_no);
}
}}
}}
