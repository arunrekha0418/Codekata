//12.to shift the array elements in right for k times...
//7 2 3 after first shift===3 7 2 in second shift it becomes 2 3 7...

import java.util.Scanner;
class shift
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,n,j,t,k,b;
System.out.println("ENTER THE NO.OF ARRAY ELEMENTS");
n=in.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("ENTER THE NO.OF.TIMES TO SHIFT THE ARRAY ELEMENTS");
k=in.nextInt();
for(b=0;b<k;b++)//loop to run for shifting
{
	t=a[n-1];//bcoz here the last element should be the first element so we are storing in temporary variable..
for(i=n-2;i>=0;i--)
{
a[i+1]=a[i];
}
a[0]=t;//during first shift 3 is shifted to front..
}
for(i=0;i<n;i++)
{
System.out.print(a[i] + " ");
}
}}
