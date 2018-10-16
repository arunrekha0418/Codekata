package guviplayer;
import java.util.*;
//to print the length of the string if its is prime
public class Set17_167 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String a;
	int i,n,count=0;
	a=in.nextLine();
	n=a.length();
	for(i=2;i<=n;i++)
	{
		if(n%i==0)
			count++;
	}
	if(count==1)
		System.out.println(n + " yes");
	else
		System.out.println(n + " no");
	in.close();
	}

}
