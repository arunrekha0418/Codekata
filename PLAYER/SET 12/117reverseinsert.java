//117 reverse the string and insert '-'...

import java.util.*;
class revins
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i;
String a;
System.out.println("ENTER THE STRING:");
a=in.nextLine();
n=a.length();
StringBuilder sb=new StringBuilder(a);
sb.reverse();
String b=sb.toString();
char ch[]=b.toCharArray();
for(i=0;i<n;i++)
{
System.out.print(ch[i]);
if(i==n-1)
{
break;
}
System.out.print("-");
}
}}
