//31.to find the maximum product subarrray...


import java.util.*;
class prosub
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,pro=1,max=1;
System.out.println("ENTER THE SIZE OF THE ARRAY");
n=in.nextInt();
System.out.println("ENTER THE ARRAY ELEMENTS");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0,j=i+1;i<n&&j<n;i++,j++)
{
pro=pro*a[j];
if(max<pro)
max=pro;
//System.out.println(max);

}
System.out.println(max);
}}
