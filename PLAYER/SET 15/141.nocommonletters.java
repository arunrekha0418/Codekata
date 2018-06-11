//141.to check wether the 2 consecutive strings having no common letters

import java.util.*;
class strarr
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,count,totcount=0,k,l;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
String str[]=new String[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
str[i]=in.next();
}
for(i=0,j=i+1;i<n&&j<n;i++,j++)
{
char ch1[]=str[i].toCharArray();
char ch2[]=str[j].toCharArray();
count=0;
for(k=0;k<ch1.length;k++)
{
for(l=0;l<ch2.length;l++)
{
if(ch1[k]==ch2[l])
count++;
}
}
if(count>0)
totcount++;
}
if(totcount==(n-1))
{
System.out.println("NO");
System.out.println(" therre occurs a consecutive strings having  common letters");
}
else
{
System.out.println("YES ");
System.out.println(" therre occurs a consecutive strings having  no common letters");
}
}}
