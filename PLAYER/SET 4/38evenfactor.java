//38.to print the even factor of N...


import java.util.*;
class evenfact
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,n,j=0;
System.out.println("ENTER THE INPUT INTEGER");
n=in.nextInt();
if(n%2!=0)
System.out.println("THE EVEN FACTORS OF n IS: 0");
else
{
	System.out.println("THE EVEN FACTORS OF n ARE:");

for(i=1;i<=n;i++)
{
if(n%i==0)
{
j=i;
if(j%2==0)
System.out.print(j + " ");
}
}
}
}} 
