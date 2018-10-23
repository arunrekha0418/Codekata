package guviplayer;
import java.util.*;
public class Set20_191 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,j,count=0,n;
		System.out.println("ENTER THE SIZE OF THE ARRAY:");
		n=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("ENTER THE 1st ARRAY:");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("ENTER THE 2nd ARRAY:");
		for(i=0;i<n;i++)
		{
			b[i]=in.nextInt();
		}
		for(i=n-1,j=0;i>=0&&j<n;i--,j++)
		{
			if(a[i]==b[j])
				count++;
		}
		if(count==n)
			System.out.println("YES,the 2nd array is the mirror image of 1st array");
		else
			System.out.println("NO,the 2nd array is the mirror image of 1st array");

in.close();
		

	}

}
