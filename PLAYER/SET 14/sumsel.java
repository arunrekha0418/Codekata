//131.to find the odd digits in the number and print the sum if the sum is odd or even

import java.util.*;
class sumsel
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,sum=0;
String a;
System.out.println("ENTER THE INPUT:");
a=in.next();
char ch[]=a.toCharArray();
n=a.length();
for(i=0;i<n;i++)
{
if((Character.getNumericValue(ch[i])%2)!=0)
sum=sum+Character.getNumericValue(ch[i]);
}
if((sum%2)!=0)
System.out.println("THE SUM IS ODD");
else
System.out.println("THE SUM IS EVEN");
}}
