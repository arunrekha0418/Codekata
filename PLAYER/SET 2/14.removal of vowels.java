//14.reversed string after removing the vowels.

import java.util.Scanner;
class vowels
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);

String a;
int i,n;
a=in.nextLine();
char ch[]=a.toCharArray();
n=a.length();
for(i=n-1;i>=0;i--)
{
if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u')
System.out.print(ch[i]);
}

}
}
