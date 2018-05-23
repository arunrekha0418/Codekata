//28.removing duplicate characters in the given string...

import java.util.*;
class stringdup
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j;
String a;
System.out.println("ENTER THE INPUT STRING");
a=in.nextLine();
char ch[]=a.toCharArray();
n=a.length();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if((ch[i]!='*')&&(ch[i]==ch[j]))
ch[j]='*';
}
}
for(i=0;i<n;i++)
{
if(ch[i]!='*')
	System.out.print(ch[i] + " ");
}
}}

