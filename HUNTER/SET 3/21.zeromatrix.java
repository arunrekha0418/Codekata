//21.if there is an occurance of  zero make the particular row and coloumn  as zero ...

import java.util.*;
class zeromatrix
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,m,n,row=0,col=0;
System.out.println("ENTER THE SIZE OF 2D ARRAY");
m=in.nextInt();//row
n=in.nextInt();//col
int a[][]=new int[m][n];
System.out.println("ENTER THE ARRAY ELEMENTS");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=in.nextInt();
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]==0);
{
row=i;
col=j;
for(j=0;j<n;j++)//making the particular row as zero...
{
a[row][j]=0;
System.out.print(a[row][j] + " ");
}
System.out.println();
for(i=0;i<m;i++)//making the particular coloumn as zero...
{
a[i][col]=0;
System.out.print(i + "," + col + "=" +a[i][col] + " ");
}
System.out.println();

}
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j] + " ");
}
System.out.print("\n");
}
}}
