//find the max sum for given 2d array ie each row has unique value and we have to find the sum for those values...

import java.util.*;
class gift
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,m,i,j,sum=0;
System.out.println("ENTER THE SIZE OF m AND n:");
n=in.nextInt();
m=in.nextInt();
int a[][]=new int[n][m];
System.out.println("ENTER THE ELEMENTS:");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=in.nextInt();
}
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
if(a[i][j]!=0)
sum=sum+a[i][j];
}
}
System.out.println("MAXIMAL GIFT VALUE IS :" + sum);
}}
