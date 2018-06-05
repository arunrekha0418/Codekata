//74.to check wether the given string has repeating characters...

import java.util.*;
class checkrep3
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,count=0;
System.out.println("ENTER THE INPUT STRING:");
String a=in.nextLine();
n=a.length();
char ch[]=a.toCharArray();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(ch[i]==ch[j])
count=1;
}
}
if(count==1)
System.out.println("YES,THE GIVEN STRING HAS REPEATING CHARACTERS");
else
System.out.println("NO,THE GIVEN STRING HAS REPEATING CHARACTERS");
}}
