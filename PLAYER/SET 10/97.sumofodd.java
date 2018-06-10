//97.to print the sum value of all odd nos within the range

import java.util.*;
class sumrange
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int min,max,i,sum=0;
System.out.println("ENTER THE RANGE:");
min=in.nextInt();
max=in.nextInt();
for(i=min;i<=max;i++)
{
if(i%2!=0)
{
sum=sum+i;
}
}
System.out.println("THE SUM OF ALL ODD VALUES WITHIN THE RANGE: "  + sum);
}}
