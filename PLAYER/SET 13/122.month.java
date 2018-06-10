//122.to print the month in words for given input 

import java.util.*;
class month
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int m=0,i,j;
String mon[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
System.out.println("ENTER THE INPUT :");
String a=in.nextLine();
String str[]=a.split("/");
for(i=0;i<str.length;i++)
{
if(i==1)
m=Integer.parseInt(str[i]);
}

System.out.println(mon[m-1]);
}}
