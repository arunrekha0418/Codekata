//19.to find the prime factor of given number...

import java.util.Scanner;
class primefactor
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,c;
System.out.println("ENTER THE NUMBER");
n=in.nextInt();
for(i=2;i<n;i++)
{
	c=0;
if(n%i==0)
{
for(j=2;j<=i;j++)
{
if(i%j==0)
{
c++;
}
}
if(c==1)
System.out.println(i);
}
}
}}

