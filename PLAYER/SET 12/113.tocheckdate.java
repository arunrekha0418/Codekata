//113.to checj the date...

import java.util.*;
class dateche
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,count=0;
System.out.println("ENTER THE INPUT:");
String a=in.nextLine();
String str[]=a.split("/");
for(i=0;i<str.length;i++)
{
	n=Integer.parseInt(str[i]);
if(i==0)
{
	if(n>00&&n<31)
		count++;
}
if(i==1)
{
	if(n>00&&n<12)
		count++;
}
if(i==2)
{
	if(n>1000&&n<9999)
		count++;
}
}
if(count==3)
	System.out.println("YES");
else
	System.out.println("NO");
}}
