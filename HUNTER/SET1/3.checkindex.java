//hunter --->set1
//3.given a array elements check wether the index and the element are equal ;if the entire array element does not possess the property it should print -1...


import java.util.Scanner;
class indexequ
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,n,c=-1,j=0,count=0;
System.out.println("ENTER THE NO.OF ARRAY ELEMENTS:");
n=in.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
if(i==a[i])
{
count++;
b[j]=a[i];
j++;
}
}
if(count>0)
{
	for(j=0;j<count;j++)
	{
	System.out.println(b[j]);
	}
}
else
		System.out.println(c);

}}
