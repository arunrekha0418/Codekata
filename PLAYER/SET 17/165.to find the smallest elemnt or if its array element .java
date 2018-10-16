package guviplayer;
import java.util.*;
public class Set17_165 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,k,i,count=0;
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
			if(a[i]==k)
			count=1;
		}
		if(count==1)
		{
			System.out.println(k);
		}
		else
		{
			for(i=0;i<n;i++)
			{
				if(a[i]<k)
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
			
		in.close();
	}

}
