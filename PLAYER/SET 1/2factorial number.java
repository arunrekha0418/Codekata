//2.given a number to find its factorial..

import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,fact=1;
System.out.println("ENTER THE INPUT INTEGER");
n=in.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("THE FACTORIAL FOR THE GIVEN NUMBER " + n + " IS " + fact);
}} 
