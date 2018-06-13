//127.to delete the occurance of second string in first string

import java.util.*;
class deleteins
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a,b;
int n,i,j,k,count;
System.out.println("ENTER THE INPUT STRINGS:");
a=in.nextLine();
b=in.next();
char ch2[]=b.toCharArray();
String str[]=a.split(" ");
for(i=0;i<str.length;i++)
{
	char ch1[]=str[i].toCharArray();
	count=0;
	for(j=0,k=0;j<ch1.length&&k<ch2.length;j++,k++)
	{
    if(ch1[j]!=ch2[k])
	System.out.print(ch1[j]);
}
}
		System.out.print(" ");
}}
