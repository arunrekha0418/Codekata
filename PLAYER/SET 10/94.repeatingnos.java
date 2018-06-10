//94 to check wether the given integer has repeating characters...

import java.util.*;
class findrepeat
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a;
int i,n,j,count=0;
System.out.println("ENTER THE INPUT:");
a=in.next();
n=a.length();
char ch[]=a.toCharArray();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(Character.getNumericValue(ch[i])==Character.getNumericValue(ch[j]))
count++;
}
}
if(count>0)
System.out.println("YES,it,has repeating numbers");
else
System.out.println("NO,it has no repeating numbers");
}}
