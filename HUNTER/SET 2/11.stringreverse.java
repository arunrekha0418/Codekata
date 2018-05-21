//11.TO REVERSE THE GIVEN STRING IN SAME ORDER

import java.util.Scanner;
import java.io.*;
class rev
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i;
System.out.println("ENTER THE INPUT STRING :");
String a=in.nextLine();
String b[]=a.split(" ");
System.out.println("THE REVERSED INPUT STRING IS:");
for(i=0;i<b.length;i++)
{
StringBuffer sb=new StringBuffer(b[i]);
sb.reverse();
System.out.print(sb + " ");
}
}}
