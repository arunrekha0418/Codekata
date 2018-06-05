//80.min difference btw array elements...

import java.util.*;
class mindiff
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,k,min=100,diff=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
diff=a[i]-a[j];
if(Math.abs(diff)<min)
min=Math.abs(diff);
}
}
System.out.println("THE MAXIMUM DIFFERENCE IS: "  +  min);
}}
