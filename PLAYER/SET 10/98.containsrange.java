//98.to check wether the input has a all elements upto the k value..
//1234034   key value:4   ans :yes(contains:0,1,2,3,4)

import java.util.*;
class rangecheck
{
public static void main(String args[])
{
Scanner in=new Scanner (System.in);
int n,i,count=0,k,j;
System.out.println("ENTER THE INPUT STRING:");
String a=in.next();
n=a.length();
char ch[]=a.toCharArray();
System.out.println("ENTER THE CHECKING VALUE:");
k=in.nextInt();
for(i=0;i<n;i++)
{
	for(j=i+1;j<n;j++)
	{
		if(Character.getNumericValue(ch[i])==Character.getNumericValue(ch[j]))
			ch[j]='*';
	}
}
for(i=0;i<=k;i++)
{
for(j=0;j<n;j++)
{
if(i==Character.getNumericValue(ch[j]))
count++;
}
}
System.out.println(count);

if(count==k+1)
System.out.println("YES");
else
System.out.println("NO");
}}
