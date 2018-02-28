//3.reversal of a number..

import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,n,sum=0,temp;
System.out.println("ENTER THE INPUT INTEGER");
a=in.nextInt();
n=a;
while(n!=0)
{
temp=n%10;
sum=(sum*10)+temp;
n=n/10;
}
System.out.println("THE REVERSED NUMBER FOR THE GIVEN INTEGER " +  a + " IS " + sum);
}}
