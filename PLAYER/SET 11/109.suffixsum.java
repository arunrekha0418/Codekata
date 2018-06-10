//109.to print the suffix sum array for the given array


import java.util.*;
class suffixsum
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,sum1=0,sum2=0,k=1;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER  THE ARRAY ELEMENTS:");
int a[]=new int[n];
int b[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
sum1=sum1+a[i];
}
b[0]=sum1;
sum2=sum1;
for(i=n-2;i>=0;i--)
{
sum2=sum2-a[i];
b[k]=sum2;
k++;
}
for(i=0;i<k;i++)
{
System.out.print(b[i] + " ");
}
}}
