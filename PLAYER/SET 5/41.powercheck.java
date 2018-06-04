//41.to check the given N number is  the power of K

import java.util.*;
class powercheck
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,k,pow=1,count=0,i;
System.out.println("ENTER THE n VALUE");
n=in.nextInt();
System.out.println("ENTER THE k VALUE");
k=in.nextInt();
for(i=1;i<n;i++)
{
pow=pow*k;
if(pow==n)
count=1;
}
if(count==1)
System.out.println("YES");
else
System.out.println("NO");
}}
