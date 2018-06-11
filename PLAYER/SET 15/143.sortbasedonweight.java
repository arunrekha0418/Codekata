//143.sort the person based on their weight

import java.util.*;
class sortwt
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,pos=0;
System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
System.out.println("ENTER THE PERSON ARRAY:");
int per[]=new int[n];
for(i=0;i<n;i++)
{
per[i]=in.nextInt();
}
System.out.println("ENTER THE WEIGHT ARRAY:");
int wt[]=new int[n];
int cpy[]=new int[n];
for(i=0;i<n;i++)
{
wt[i]=in.nextInt();
cpy[i]=wt[i];
}
Arrays.sort(cpy);
System.out.println("THE PERSON ARE SORTED BASED ON THE WEIGHT:");
for(i=0;i<n;i++)//copied weight
{
for(j=0;j<n;j++)//original weight
{
if(cpy[i]==wt[j])
pos=j;
}
System.out.print(per[pos] + " " );
}
}}
