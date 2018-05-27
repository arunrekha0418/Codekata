//40.to check sum of digit is pallindrome for given integer
 

import java.util.*;
class sumpallindrome
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,n,j,t1,t2,sum1=0,sum2=0,alt=0,inp;
System.out.println("ENTER THE INPUT INTEGER");
inp=in.nextInt();
while(inp>0)
{
t1=inp%10;
sum1=sum1+t1;
inp=inp/10;
}
//System.out.println(sum1);

alt=sum1;
while(alt>0)
{
t2=alt%10;
sum2=(sum2*10)+t2;
alt=alt/10;
}
if(sum1==sum2)
System.out.println("YES");
else
System.out.println("NO");
}}
