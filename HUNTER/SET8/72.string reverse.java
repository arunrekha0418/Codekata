package guvihunter;
import java.util.*;
public class Set8_72 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n,i;
		System.out.println("ENTER THE STRING");
		String a[]=in.nextLine().split(" ");
		n=a.length;
		for(i=0;i<n;i++)
		{
			if(i%2==0)
			{
				StringBuilder sb=new StringBuilder(a[i]);
				sb.reverse();
				a[i]=sb.toString();
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
		in.close();
	}

}
