//138.to check wether the given numberr is the power of 2...

import java.util.*;
class poweroftwo
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,pow=1,n,count=0;
System.out.println("ENTER THE INPUT:");
n=in.nextInt();
for(i=0;i<n;i++)
{
pow=pow*2;
if(pow==n)
{
count=1;
break;
}
}
if(count==1)
System.out.println("THE GIVEN NUMBER IS THE POWER OF 2");
else
System.out.println("THE GIVEN NUMBER IS NOT THE POWER OF 2");
}}
