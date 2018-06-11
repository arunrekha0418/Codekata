//146.to find hte value of a!/b!

import java.util.*;
class divfact
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,b,i,pro1=1,pro2=1,res=1;
System.out.println("ENTER THE INPUTS:");
a=in.nextInt();
b=in.nextInt();
for(i=1;i<=a;i++)
{
pro1=pro1*i;
}
for(i=1;i<=b;i++)
{
pro2=pro2*i;
}
res=pro1/pro2;
System.out.println("THE RESULT IS : " + res);
}} 
