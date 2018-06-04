//59.to print the one's when it found 0..eg 1110101101 ans=111111


import java.util.*;
class one
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n,pos;
System.out.println("ENTER  THE SIZE OF THE ARRAY:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
pos=0;
if(a[i]==0)
{
pos=i;
for(j=pos-1;j>=0;j--)
{
if(a[j]==1){
System.out.print(a[j] + " ");}
else
	break;
}
}
else
	continue;
}
}}
