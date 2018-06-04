//47.to check wether  the interior angles form triangle...

import java.util.*;
class triangle
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,b,c;
System.out.println("ENTER THE INPUT :");
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if((a!=0)&&(b!=0)&&(c!=0)&&((a+b+c)==180))
System.out.println("YES");
else
System.out.println("NO");
}}
