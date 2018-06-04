//46.to segregate the team based on their min diff


import java.util.*;
class diff
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n,sum1=0,sum2,count1=0,count2,min=100,difftot=0,diff=0;
System.out.println("ENTER THE SIZE OF THE ARRAY");
n=in.nextInt();
System.out.println("ENTER THE ARRAY ELEMENTS");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
sum1=sum1+a[i];
if(sum1!=0)
count1++;
sum2=0;
count2=0;
for(j=i+1;j<n;j++)
{
sum2=sum2+a[i];
if(sum2!=0)
count2++;
}
diff=sum1-sum2;
if(min>diff)
{
min=diff;
difftot=count1-count2;
}
}
System.out.println(Math.abs(difftot));
}}
