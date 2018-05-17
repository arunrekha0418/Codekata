//to print the array element based on the cond..
//index=odd;element=even  and viceversa

import java.util.Scanner;
class index
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i;
System.out.println("ENTER THE TOTAL NO.OF.ARRAY ELEMENTS");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
if(((i%2)!=0)&&((a[i]%2)==0))
System.out.print(a[i] + " ");
if(((i%2)==0)&&((a[i]%2)!=0))
System.out.print(a[i] + " ");
}
}}
