package guviplayer;
import java.util.*;
public class Set20_197 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,i,sub_ans=0;
		System.out.println("ENTER THE SIZE OF THE ARRAY");
		n=in.nextInt();
		int a[]=new int[n];
		System.out.println("ENTER THE ARRAY ELEMENTS");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		sub_ans=a[n-1]-a[0];
		System.out.println("THE DIFFERENCE BETWEEN  THE MAXIMUM AND MINIMUM ARRAY ELEMENT IS: " + sub_ans);
in.close();
	}

}
