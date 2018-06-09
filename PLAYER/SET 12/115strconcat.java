//115.to concatenate the 2 strings based on the conditionss...

import java.util.*;
class shortstr
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a,b;
int n1,n2,i,j;
System.out.println("ENTER THE INPUT STRINGS:");
a=in.nextLine();
b=in.nextLine();
n1=a.length();
n2=b.length();
char ch1[]=a.toCharArray();
char ch2[]=b.toCharArray();
if(n1==n2)
{
for(i=0;i<n1;i++)
System.out.print(ch1[i]);
for(i=0;i<n2;i++)
System.out.print(ch2[i]);
}
else if(n1>n2)
{
for(i=0;i<n2;i++)
System.out.print(ch1[i]);
for(i=0;i<n2;i++)
System.out.print(ch2[i]);
}
else{
for(i=0;i<n1;i++)
System.out.print(ch1[i]);
for(i=0;i<n1;i++)
System.out.print(ch2[i]);
}
}}
