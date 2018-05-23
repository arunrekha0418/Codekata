//1.to print the repeated element in the given array...

import java.util.*;
class repeatelement
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,count=0,lcount;
System.out.println("ENTER THE SIZE OF THE ARRAY");
n=in.nextInt();
System.out.println("ENTER THE ARRAY ELEMENTS");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
	lcount=0;
for(j=i+1;j<n;j++)
{
if((a[i]!='*')&&(a[i]==a[j]))
{
a[j]='*';
count=1;
lcount++;//1 2 2 3 2 it will make the (2'nd&3'rd) 2 as * but it will print the 2 again and again bcoz we'r  making comaparison so inorder to print 2  only once we are making count...
if(lcount==1)
	System.out.print(a[i] + " ");
}
}
}
if(count==0)
System.out.println("THE GIVEN ARRAY ELEMENTS ARE UNIQUE");
}}
