//99.to convert binary to octal

import java.util.*;
class binoct
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a;
System.out.println("ENTER THE INPUT:");
a=in.next();
System.out.println("THE OCTAL EQUIVALENT FOR GIVEN BINARY IS:");
int b=Integer.parseInt(a,2);

System.out.println(Integer.toOctalString(b));
}}
