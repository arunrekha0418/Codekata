//1.given a string print its reverse...

import java.util.Scanner;
class stringrev
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a;
int n,i;
System.out.println("ENTER THE INPUT STRING:");
a=in.nextLine();
n=a.length();
char ch[]=a.toCharArray();
System.out.println("THE REVERSED STRING IS:");
for(i=n-1;i>=0;i--)
{
System.out.print(ch[i]);
}
}}
