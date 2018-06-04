//56.to check the character in the given string...


import java.util.*;
import java.util.Scanner;
class search
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a;

int n,i,pos=0;
System.out.println("ENTER THE INPUT STRING:");
a=in.nextLine();
n=a.length();
System.out.println("ENTER THE CHARACTER TO BE SEARCHED:");
char k=in.next().charAt(0);
char ch[]=a.toCharArray();
for(i=0;i<n;i++)
{
if(k==ch[i])
pos=i;
break;
}
System.out.println(pos+1);
}}
