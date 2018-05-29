//34.to print the sequence of 3rd character..

import java.util.*;
class printchar
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i;
System.out.println("ENTER THE INPUT STRING");
String a=in.nextLine();
n=a.length();
char ch[]=a.toCharArray();
for(i=0;i<n;)
{
System.out.print(ch[i]);
i=i+3;
}
}}
