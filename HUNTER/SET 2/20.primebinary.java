//20.prime elements of an array in binary form..

import java.util.Scanner;
class binaryprime
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,num=0,count=0,min,max,rem,j,primecount,primecount1=0;
String x="";
System.out.println("ENTER THE RANGE:");
min=in.nextInt();
max=in.nextInt();
for(i=min;i<=max;i++)
{
num=i;
primecount=0;
while(num>0)
{
rem=num%2;
if(rem==1)
{
	count++;
}
x=x+" "+rem;
num=num/2;
}
//System.out.println(i+ "=" +x);
for(j=2;j<=count;j++)
{
	if(count%i==0)
		primecount++;
	if(primecount==1)
		primecount1++;

}

}
System.out.println("THE PRIME NUMBER COUNT OF THE ARRAY ELEMENTS IN BINARY REPRESENTATION IS");
System.out.println(primecount1);
}}
