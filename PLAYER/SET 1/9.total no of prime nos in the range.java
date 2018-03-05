//9.to print the total no.of prime numbers in the given range.

import java.util.Scanner;
class primerange2
{
public static void main(String args[])
{
int min,max,i,j,count,total=0;
Scanner in=new Scanner(System.in);
System.out.println("ENTER THE RANGE");
min=in.nextInt();
max=in.nextInt();
for(i=min;i<=max;i++)
{ count=0;
for(j=2;j<=i;j++)
{
if((i%j==0))
count++;
}
if(count==1)
total++;
}
System.out.println("THE NO.OF PRIME NUMBERS IN THE GIVEN RANGE:" + total);
}}
