//70.string after append...

import java.util.*;
class appendstr
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a,b;
System.out.println("ENTER THE INPUT STRING:");
a=in.nextLine();
System.out.println("ENTER THE STRING TO BE APPENDED:");
b=in.nextLine();
StringBuffer sb=new StringBuffer(a);
sb=sb.append(b);
System.out.println(sb);
}}
