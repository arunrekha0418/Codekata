//100.binary to hexadecimal conversion...

import java.util.*;
class binhex
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a;
System.out.println("ENTER THE INPUT:");
a=in.next();
System.out.println("THE HEXADECIMAL EQUIVALENT FOR GIVEN BINARY IS:");
int b=Integer.parseInt(a,2);
System.out.println(Integer.toHexString(b));
}}
