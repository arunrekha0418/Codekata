//81.maxbit segement

import java.util.*;
class max
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE  ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
Arrays.sort(a);
System.out.println("THE RESULT IS :"  +  a[n-1]);
}}
