//22.to create a new array which is formed by multiplying all elements except the ith element...

import java.util.*;
class productarray
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,n,j=0,pro=1;
System.out.println("ENTER THE SIZE OF THE ARRAY");
n=in.nextInt();
System.out.println("ENTER THE ARRAY ELEMENTS");
int a[]=new int[n];
int b[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
pro=pro*a[i];
}
for(i=0;i<n;i++)
{
b[j]=pro/a[i];
j++;
}
for(i=0;i<n;i++)
{
System.out.print(b[i] + " ");
}
}}
