//10.to print 'yes' if the character difference is 1

import java.util.Scanner;
class chardiff
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
if(n1==n2)
{
for(i=0;i<n1;i++)
{
if(ch1[i]!=ch2[i])
count++;
}
System.out.println(count);
if(count==1)
System.out.println("YES");
else
System.out.println("NO");
}
else
	System.out.println("THE STRINGS HAVE UNEVEN LENGTH");
}}
