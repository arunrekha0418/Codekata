//96.to sum the first and last digit

import java.util.*;
class sumspl
{
public static void main(String args[])
{
Scanner in=new Scanner (System.in);
int n,i,sum=0;
System.out.println("ENTER THE INPUT STRING:");
String a=in.next();
n=a.length();
char ch[]=a.toCharArray();
sum=Character.getNumericValue(ch[0])+Character.getNumericValue(ch[n-1]);
System.out.println("THE SUM VALUE OF FIRST AND LAST DIGIT :" + sum);
}}
