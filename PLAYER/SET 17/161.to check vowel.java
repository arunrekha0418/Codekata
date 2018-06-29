//161.to check wetherr all the stings in the array contains atleast 1 vowel...

import java.util.*;
class strvowel
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,count,totcount=0,j;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
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
if(totcount==n)
System.out.println("YES,ALL THE STRINGS IN THE ARRAY CONTAINS ATLEAST 1 VOWEL");
else
System.out.println("NO,ALL THE STRINGS IN THE ARRAY DOESN'T CONTAINS ATLEAST 1 VOWEL");
}}
