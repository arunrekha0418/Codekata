//32.to print the last odd element after traversing the entire array

import java.util.*;
class selection
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n;
System.out.println("ENTER THE SIZE OF THE ARRAY");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
while(n>1)
{
j=0;
for(i=0;i<n;i++)
{
if(i%2!=0)
{
a[j]=a[i];
j++;
}
}
n=j;
}
System.out.println(a[0]);
}}
