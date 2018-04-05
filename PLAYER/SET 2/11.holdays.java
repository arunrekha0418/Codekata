//11.given a day print if its a holiday


import java.util.Scanner;
class holidays
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,f=0;
//String a[]=new String[2];
String a[]={"saturday","sunday"};
String b=in.nextLine();
//System.out.println(b);
for(i=0;i<2;i++)
{
if(a[i].equals(b))
f=1;
}

if(f==1)
	System.out.println("WEEKEND");
else
	System.out.println("WORKING DAY");

}}
