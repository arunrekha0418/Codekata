//57.to count the occurance of character in the given string...


import java.util.*;
class count
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a;
int n,i,count=0;
System.out.println("ENTER THE INPUT STRING:");
a=in.nextLine();
n=a.length();
System.out.println("ENTER THE CHARACTER TO BE SEARCHED:");
char k=in.next().charAt(0);
char ch[]=a.toCharArray();
for(i=0;i<n;i++)
{
if(k==ch[i])
count++;
}
System.out.println("THE NO.OF OCCURANCE OF " +  k  + " IN THE STRING IS " + count);
}}
