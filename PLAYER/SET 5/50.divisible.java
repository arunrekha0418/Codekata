//50.to check the given integer is divsible by numbers less than n...

import java.util.*;
class divisble
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,count=0;
System.out.println("ENTER THE INPUT INTEGER");
n=in.nextInt();
for(i=2;i<n;i++)
{
if(n%i==0)
count++;
}
if(count!=0)
System.out.println("YES");
else
System.out.println("NO");
}}
