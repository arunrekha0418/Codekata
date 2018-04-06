//16.to check the array elements which has no repition

import java.util.Scanner;
class checkrep
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,n,j,c=1;
System.out.println("ENTER THE TOTAL NO.OF.ARRAY ELEMENTS");
n=in.nextInt();
System.out.println("ENTER THE ARRAY ELEMENTS");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
c++;
}
}
if(c==1)
	System.out.println(a[i]);
}
}}
