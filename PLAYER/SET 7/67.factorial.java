//67.to print the factorial of given number

import java.util.*;
class fact3
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,fact=1,i;
System.out.println("ENTER THE INPUT :");
n=in.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("THE FACTORIAL FOR GIVEN INPUT " + n  + " IS " + fact);
}}
