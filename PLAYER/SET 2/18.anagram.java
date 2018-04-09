//18.anagram of strings...
/*steps:
1)check the length of 2 strings.
2)sort the 2 strings.
3)built in function-->use Arrays.equals() method
4)or use for loop to check each character and make a count..*/

import java.util.Scanner;
import java.util.Arrays;
class anagram
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n1,n2,count,count1=0,b,k;
String a;
//boolean status=true;
System.out.println("ENTER THE MAIN INPUT STRING:");
a=in.nextLine();
n1=a.length();
char ch1[]=a.toCharArray();
System.out.println("ENTER THE NO.OF. INPUT STRINGS TO BE CHECKED:");
k=in.nextInt();
for(b=0;b<=k;b++)
{
String c=in.nextLine();
n2=c.length();
char ch2[]=c.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
if(n1==n2)
{
	count=0;
for(i=0,j=0;i<n1;i++,j++)
{
if(ch1[i]==ch2[j])//it checks each character of the string..
count++;
}
if(count==6)//so if both the strings are equal it will result in the exact count of 6 eg.kabali==kabail(after sorting),, so increase the anagram count...
	count1++;
}
/*status=Arrays.equals(ch1,ch2);
if(status)
	count++;(for the usage of built in functions)*/
}
//}
System.out.println(count1);
}}

