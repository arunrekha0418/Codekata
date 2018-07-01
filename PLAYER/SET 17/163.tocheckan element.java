//163.to check wether the given element is present in the array

import java.util.*;
class bisearch
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,k,mid=0,i,count=0,pos=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER THE ELEMENT TO BE SEARCHED:");
k=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS :");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
Arrays.sort(a);
mid=n/2;
//System.out.println(mid);
//System.out.println(a[mid]);
if(k>=a[mid])
{
for(i=mid;i<n;i++)
{
if(k==a[i])
{
count=1;
pos=i;
}
}
}
else
{
for(i=0;i<mid;i++)
{
if(k==a[i])
{
count=1;
pos=i;
}
}
}
if(count==1)
System.out.println("THE ELEMENT IS FOUND IN THE ARRAY IN THE OF POSITION " + (pos+1));
else
	System.out.println("THE ELEMENT IS NOT FOUND IN THE ARRAY " );
}}
