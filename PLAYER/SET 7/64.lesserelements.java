//64.to print the  array numbers which are less than the key elements...

import java.util.*;
class less
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,k=0,b;
System.out.println("ENTER THE SIZE OF THE ARRAY:" );
n=in.nextInt();
System.out.println("ENTER THE ARRAY	ELEMENTS:" );
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("ENTER THE KEY ELEMENT:" );
b=in.nextInt();
int t[]=new int[n];
Arrays.sort(a);
for(i=0;i<n;i++)
{
if(a[i]<b)
{
t[k]=a[i];
k++;
}
}
for(i=0;i<k;i++)
{
System.out.print(t[i] + " " );
}


}}
