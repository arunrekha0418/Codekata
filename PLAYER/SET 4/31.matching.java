//31.matching parenthesis...


import java.util.*;
class match
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("ENTER THE INPUT STRING");
int n,i,j,count=0;
String a=in.nextLine();
n=a.length();
char ch[]=a.toCharArray();
for(i=0,j=n-1;i<n&&j>=0;i++,j--)
{
	if(i!=j){
	if(ch[i]=='('&&ch[j]==')')
	{count++;}
	else
		break;
	}
}
	System.out.println(count);

if(count==n/2&&n%2==0)
	System.out.println("YES");
else
	System.out.println("NO");
}}
