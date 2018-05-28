//34.to print the smallest combination of integer which should be greater than input integer....

import java.util.*;
import java.io.*;
class smallestcombo
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n,k,max=10000,sum;
char t;
System.out.println("ENTER THE INPUT INTEGER:");
String a=in.next();
char ch[]=a.toCharArray();
n=a.length();


for(i=1;i<=n;i++)
{
	
	for(j=0;j<n-1;j++)
	{
		t=ch[j];
		ch[j]=ch[j+1];
		ch[j+1]=t;
sum=0;
	for(k=0;k<n;k++)
	{
		
		sum=(sum*10)+Character.getNumericValue(ch[k]);
	}
	if(max>sum&&sum!=Integer.parseInt(String.valueOf(a)))
		max=sum;
	}
	
}
if(max>Integer.parseInt(String.valueOf(a)))
	System.out.println("THE SMALLEST COMBINATION OF INTEGER GREATER THAN INPUT INTEGER IS :" + max);
else
	System.out.println("IMPOSSIBLE");
}}
