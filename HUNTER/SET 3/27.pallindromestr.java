//27.to print the string which doesn't possess pallindrome....


import java.util.*;
class pallindromestr
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a;
int n,i,j,count=0;
System.out.println("ENTER THE INPUT STRING");
a=in.nextLine();
n=a.length();
char ch[]=a.toCharArray();
for(i=0,j=n-1;i<n&&j>=0;i++,j--)
{
if(ch[i]!=ch[j])
count=1;
}
if(count==1)
{
for(i=0;i<n;i++)
{
System.out.print(ch[i]);
}
}
else
System.out.print("PALLINDROME");
}}
