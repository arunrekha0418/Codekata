//6.to find the first repeating element in the array.

import java.util.Scanner;
class firstrepeat
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,count=0,n,k=0;
System.out.println("ENTER THE TOTAL NO.OF.ARRAY ELEMENTS");
n=in.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
   for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
count++;
b[k]=a[i];
k++;
}
}}
if(count>0)
{
System.out.println(b[0]);
}
else
System.out.println("THERE ARE NO REPEATING ELEMENTS IN THE ARRAY-->UNIQUE");
}}
