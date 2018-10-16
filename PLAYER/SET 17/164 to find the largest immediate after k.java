package guviplayer;
import java.util.*;
//to find the just largest number of K
public class Set17_164 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,k,i;
		System.out.println("ENTER THE SIZE  OF THE ARRAY ELEMENTS:");
		n=in.nextInt();
		System.out.println("ENTER THE k ELEMENT:");
		k=in.nextInt();
		int a[]=new int[n];
		System.out.println("ENTER THE  ARRAY ELEMENTS:");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>k)
			{
				System.out.println(a[i]);
				break;
			}
		}
		in.close();
	}

}
