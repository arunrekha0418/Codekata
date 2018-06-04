//44.to print the given string after 3 rotations eg .Sundar 
//after 1st rotation==undarS, 2nd rotation==ndarSu, 3rd rotation=darSun
//so based on rotation count split the array and print the character...


import java.util.*;
class strrot
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,rot,n;
String a;
System.out.println("ENTER THE INPUT STRING :");
a=in.nextLine();
n=a.length();
char ch[]=a.toCharArray();
System.out.println("ENTER THE NO.OF.ROTATION :");
rot=in.nextInt();
for(i=rot;i<n;i++)
{
System.out.print(ch[i]);
}
for(i=0;i<=rot-1;i++)
{
System.out.print(ch[i]);
}
}}
