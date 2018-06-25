//151.to update the single change if possible in the given string to contain only a or b....

import java.util.*;
class modified
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,count=0;
String a;
System.out.println("ENTER THE INPUT:");
a=in.nextLine();
n=a.length();
char ch[]=a.toCharArray();
for(i=0;i<n;i++)
{
if(ch[i]!='a'&&ch[i]!='b')
count++;
}
if(count==1)
System.out.println("MODIFICATION IS POSSIBLE");
else
System.out.println("MODIFICATION IS NOT POSSIBLE");
}}
