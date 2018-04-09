//20.to print the encoded string by adding 3 characters...

import java.util.Scanner;
class encode
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a;
int i,n;
System.out.println("ENTER THE STRING");
a=in.nextLine();
n=a.length();
char ch[]=a.toCharArray();
for(i=0;i<n;i++)
{
	int b=ch[i]+3;
System.out.print(Character.toString((char) b));
}
}}
