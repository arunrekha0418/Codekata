//60.to check wether the 2 strings have any common character...

import java.util.*;
class common
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
for(i=0;i<n1;i++)
{
for(j=0;j<n2;j++)
{
if(ch1[i]==ch2[j])
count++;
}
}
if(count>0
)
System.out.println("YES");
else
System.out.println("NO");
}}
