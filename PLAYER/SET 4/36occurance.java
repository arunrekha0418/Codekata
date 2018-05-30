//36.to find the no.of occurance of K in N...


import java.util.*;
class occu
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int k,count=0,i;
String a;
System.out.println("ENTER THE INPUT INTEGER:");
a=in.next();
char ch[]=a.toCharArray();
System.out.println("ENTER THE k INTEGER TO CHECK ITS OCCURANCE:");
k=in.nextInt();
for(i=0;i<ch.length;i++)
{
if(Character.getNumericValue(ch[i])==k)
count++;
}
System.out.println("THE NO.OF.OCCURANCE OF k IN n IS " + count);
}}
