//121.to  find the smallest string

import java.util.*;
class lex
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j;
System.out.println("ENTER THE ARRAY SIZE:");
n=in.nextInt();
String a[]=new String[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.next();
}
Arrays.sort(a);
System.out.println("THE SMALLEST STRING IS : " + a[0]);
}}
