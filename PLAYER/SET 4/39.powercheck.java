//39.to check wether the given integer is power of 2


import java.util.*;
class powcheck
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,pow=2,count=0;
System.out.println("ENTER THE INPUT INTEGER");
n=in.nextInt();
for(i=1;i<=n;i++)
{
pow=pow*2;
if(pow==n)
count=1;
}
if(count==1)
System.out.println("YES");
else
System.out.println("NO");
}}
