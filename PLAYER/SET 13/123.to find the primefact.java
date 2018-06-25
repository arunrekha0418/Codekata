//123 to find the prime factors of the given number....

import java.util.*;
class primefact
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,num=0,count;
System.out.println("ENTER THE INPUT :");
n=in.nextInt();
System.out.println("THE PRIME FACTORS ARE:");
for(i=2;i<=n;i++)
{
if(n%i==0)
{
num=i;
count=0;
for(j=2;j<=num;j++)
{
if(num%j==0)
count++;
}
if(count==1)
System.out.print(i + " ");
}
}
}}
