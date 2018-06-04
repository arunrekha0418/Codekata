//48.TO PRINT THE ODD FACTORS OF THE NUMBER..

import java.util.*;
class odd
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i;
System.out.println("ENTER THE INPUT:");
n=in.nextInt();
System.out.println("THE ODD FACTORS ARE:");
for(i=1;i<=n;i++)
{
if(n%i==0)
{
if(i%2!=0)
System.out.println(i);
}
}
}}
