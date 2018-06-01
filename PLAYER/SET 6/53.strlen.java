//53.to find the length of string without using strlen...

import java.util.*;
class strlen
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a;
int i,n=0;
System.out.println("ENTER THE INPUT:");
a=in.nextLine();
char ch[]=a.toCharArray();
for(char c:ch)
{
n++;
}
System.out.println("THE LENGTH OF THE STRING IS " + n);
}}
