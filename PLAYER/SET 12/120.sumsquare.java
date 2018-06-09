//120.to print the sum of squares...

import java.util.*;
class sumsquares
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,n,sum=0,pro=1;
String a;
System.out.println("ENTER THE INPUT:");
a=in.nextLine();
char ch[]=a.toCharArray();
n=a.length();
for(i=0;i<n;i++)
{
pro=Character.getNumericValue(ch[i])*Character.getNumericValue(ch[i]);
sum=sum+pro;
}
System.out.println("THE SUM OF THE SQUARES: " + sum);
}}
