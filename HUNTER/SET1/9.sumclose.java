//9.to find the array elements whose sum is close to 0

import java.util.Scanner;
class sumclose
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n;
System.out.println("ENTER THE TOTAL NO.OF.ARRAY ELEMENTS");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]+a[j]==0||a[i]+a[j]==1||a[i]+a[j]==-1)
{
System.out.println(a[i] + " " + a[j]);
}
}}
}}
