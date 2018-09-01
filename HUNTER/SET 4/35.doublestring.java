//35.to form double string of the given string by deleting 1 character..

import java.util.*;
class doublestring
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n,k=0,count,totcount=0;
String a=in.nextLine();
n=a.length();
char ch[]=a.toCharArray();
int c[]=new int[n];
for(i=0;i<n;i++)
{
count=1;
for(j=i+1;j<n;j++)
{
if((ch[i]==ch[j])&&(ch[i]!='*'))
{
ch[j]='*';
count++;
}
}
if(ch[i]!='*')
{
c[k]=count;
k++;
}
}
for(i=0;i<k;i++)
{
	//System.out.println(c[i]);
if(c[i]==1)
totcount++;
}
if(totcount==1)
System.out.println("YES,the given string can form double string by deleting 1 character");
else
System.out.println("NO,the given string cannot form double string by deleting 1 character");
}}
