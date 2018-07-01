//162.to check in the array which contains atleast k strings which holds vowels...

import java.util.*;
class strvoweelcheck
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,count,totcount=0,j,k;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER THE CHECKPOINT:");
k=in.nextInt();
String a[]=new String[n];
System.out.println("ENTER THE STRINGS:");
for(i=0;i<n;i++)
{
a[i]=in.next();
}
for(i=0;i<n;i++)
{
char ch[]=a[i].toCharArray();
count=0;
for(j=0;j<ch.length;j++)
{
if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
count++;
}
if(count>0)
totcount++;
}
if(totcount>=k)
System.out.println("YES,THERE OCCURS ATLEAST k STRINGS IN THE ARRAY WHICH CONTAINS VOWEL");
else
System.out.println("NO,THERE OCCURS ATLEAST NO k STRINGS IN THE ARRAY WHICH DOESN'T CONTAINS VOWEL");
}}
