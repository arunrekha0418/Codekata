//51.to find the second smallest element in the array


import java.util.*;
class small
{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
int i,n,j,min=0;
System.out.println("ENTER THE SIZE OF THE ARRAY");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
Arrays.sort(a);
for(i=0;i<2;i++)
{
if(min<a[i])
min=a[i];
}
System.out.println("THE SECOND SMALLEST ELEMENT IS :" + min);
}}
