//13.sum of squares of the digits.

import java.util.Scanner;
class square
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int t,n,sum=0;
n=in.nextInt();
while(n!=0)
{
t=n%10;
sum=sum+(t*t);
n=n/10;
}
System.out.println(sum);
}}
