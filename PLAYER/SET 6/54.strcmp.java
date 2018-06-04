//54.to compare the string without using strcmp function (case sensitive)

import java.util.*;
class strcmp
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a,b;
int n1,n2,i,j,count=0;
System.out.println("ENTER THE INPUT STRINGS");
a=in.nextLine();
b=in.nextLine();
n1=a.length();
n2=b.length();
char ch1[]=a.toCharArray();
char ch2[]=b.toCharArray();
for(i=0,j=0;i<n1&&j<n2;i++,j++)
{
if(ch1[i]==ch2[j])
count++;
}
if(count==n1)
System.out.println("YES");
else
System.out.println("NO");
}}
