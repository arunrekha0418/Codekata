//35.to print the maximum repeating character in the string...


import java.util.*;
class maxrep
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,max,n,j,k,count,max_pos=0;
System.out.println("ENTER THE INPUT STRING");
String a=in.nextLine();
String b[]=a.split(" ");
n=b.length;
for(i=0;i<n;i++)
{
char ch[]=b[i].toCharArray();
count=1;
max=0;
for(j=0;j<ch.length;j++)
{
for(k=j+1;k<ch.length;k++)
{
if(ch[j]==ch[k])
{
count++;
if(max<count)
max=count;
System.out.print(ch[j]);
}
}}
}//i loop
}}
