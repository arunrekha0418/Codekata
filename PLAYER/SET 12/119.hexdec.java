//119.conversion of hexadecimal to decimal...

import java.util.*;
class hexdec
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a;
System.out.println("ENTER THE HEXDECIMAL INPUT :");
a=in.nextLine();
System.out.println("THE DECIMAL EQIUVALENT IS: " + Integer.parseInt(a,16));
}} 
