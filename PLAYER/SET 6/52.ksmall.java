//52.to find the Kth smallest element in the array


import java.util.*;
class ksmall
{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
int i,n,j,min=0,k;
System.out.println("ENTER THE SIZE OF THE ARRAY");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
Arrays.sort(a);
System.out.println("ENTER THE k VALUE");
k=in.nextInt();

for(i=0;i<k;i++)
{
if(min<a[i])
min=a[i];
}
System.out.println("THE Kth SMALLEST ELEMENT IS :" + min);
}}
