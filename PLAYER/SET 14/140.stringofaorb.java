//140.to find wether the given string contains only A or B

import java.util.*;
class strfind
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,count=0,count2=0;
String a;
System.out.println("ENTER THE STRING:");
a=in.nextLine();
n=a.length();
char ch[]=a.toCharArray();
for(i=0;i<n;i++)
{
if(ch[i]=='a'||ch[i]=='b'||ch[i]=='A'||ch[i]=='B')
count=1;
else
count2++;
}
if(count==1&&count2==0)
System.out.println("THE STRING  ONLY CONTAINS a OR b");
else
System.out.println("THE STRING NOT ONLY CONTAINS a OR b");
}}
