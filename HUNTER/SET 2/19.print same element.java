//19.to print the same array elements for given number of arrays ...

import java.util.Scanner;
class printsame
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,k,i,j,b=0,i1,j1;
System.out.println("ENTER THE NO.OF.ARRAYS");
n=in.nextInt();
System.out.println("ENTER THE NO.OF.ARRAY ELEMENTS");
k=in.nextInt();
System.out.println("ENTER THE ARRAY ELEMENTS");
int a[][]=new int[n][k];
for(i=0;i<n;i++)
{
for(j=0;j<k;j++)
{
a[i][j]=in.nextInt();
}
}

for(i=0;i<n;i++)
{
	for(j=0;j<k;j++)
	{
		inner:
		for(i1=i+1;i1<n;i1++)
		{
			for(j1=0;j1<k;j1++)
			{
				if(a[i1][j1]==a[i][j])
					System.out.println(a[i][j]);
			}
			break;
		}
		
	}
}
}}
