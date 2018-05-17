//8.to check the sum of 'i' and 'j' index should present in the given array and display it...

import java.util.Scanner;
class sumequals
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,k,n,sum=0;
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
sum=a[i]+a[j];
for(k=0;k<n;k++)
{
if(sum==a[k])
System.out.println(a[i] + " " + a[j] + " "+ sum);
}//k loop
}//j loop
}//i loop
}}
