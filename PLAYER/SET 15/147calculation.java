//147.to print the value of (a^b)%c

import java.util.*;
class cal
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,b,c,i,mul=1,res=1;
System.out.println("ENTER THE INPUTS:");
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
for(i=0;i<b;i++)
{
mul=mul*a;
}
res=mul%c;
System.out.println("THE ANSWER IS " + res);
}}
