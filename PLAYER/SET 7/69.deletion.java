//69.to print the array elements after deletion

import java.util.*;
class delete
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,k,diff=0,i;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("ENTER THE LIMIT SIZE :");
k=in.nextInt();
diff=n-k;
System.out.println("THE NEW ARRAY ELEMENTS AFTER UPDATION ARE:");
for(i=0;i<diff;i++)
{
System.out.print(a[i] + " ");
}
}}
