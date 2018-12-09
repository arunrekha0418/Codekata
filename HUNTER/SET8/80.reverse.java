package guvihunter;
import java.util.*;
public class Set8_80 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,i;
		System.out.println("ENTER THE STRING:");
		String a[]=in.nextLine().split(" ");
		n=a.length;
		for(i=n-1;i>=0;i--)
		{
			System.out.print(a[i] + " ");
		}
		
in.close();
	}

}
