//14.permutation for given integer...

import java.util.*;
import java.io.*;
class permutation
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n,k;
char t;
System.out.println("ENTER THE INPUT INTEGER:");
String a=in.next();
char ch[]=a.toCharArray();
n=a.length();
System.out.println("THE PERMUTATION FOR THE GIVEN INPUT INTEGER ARE:");

for(i=1;i<=n;i++)
{
	for(j=0;j<n-1;j++)
	{
		t=ch[j];
		ch[j]=ch[j+1];
		ch[j+1]=t;

	for(k=0;k<n;k++)
	{
		System.out.print(ch[k]);
	}
	System.out.println("");
	}
	
}
}}
