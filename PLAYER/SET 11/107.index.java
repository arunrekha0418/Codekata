//107.to print the index of 2nd string ...

import java.util.*;
class stroccuran
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a,b;
int i,j,k,index=0,count;
System.out.println("ENTER THE INPUTS:");
a=in.nextLine();
b=in.nextLine();
String str[]=a.split(" ");
char ch2[]=b.toCharArray();
for(i=0;i<str.length;i++)
{
char ch1[]=str[i].toCharArray();
count=0;
for(j=0,k=0;j<ch1.length&&k<ch2.length;j++,k++)
{
	if(ch1[j]==ch2[k])
		count++;
}
//System.out.println(count);
//System.out.println(ch1.length);
if(count==ch1.length)
	System.out.println(i+1);
}

}}
