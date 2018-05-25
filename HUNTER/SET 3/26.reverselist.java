//26.to reverse the linked list... 


import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;
class reverseli
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,ele;
System.out.println("ENTER THE SIZE OF THE LIST:");
n=in.nextInt();
LinkedList<Integer> a=new LinkedList<Integer>();
System.out.println("ENTER LIST ELEMENTS:");
for(i=0;i<n;i++)
{
ele=in.nextInt();
a.add(ele);
}
Collections.reverse(a);
/*for(Integer b:a)
{
	System.out.print(b + "->");
}*/
Iterator<Integer> itr=a.iterator();
while(itr.hasNext())
{
	System.out.print(itr.next() + "->");

}

}}
