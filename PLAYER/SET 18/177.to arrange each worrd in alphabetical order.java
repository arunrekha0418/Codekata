package guviplayer;
import java.util.*;
public class Set18_177 {
//To arrange the each words  in alphabetical order for the given sentence...
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,n;
		System.out.println("ENTER THE STRING:");
		String a[]=in.nextLine().split(" ");
		n=a.length;
		for(i=0;i<n;i++)
		{
			char ch[]=a[i].toCharArray();
			Arrays.sort(ch);
			System.out.print(ch);
			if(i!=n-1)
				System.out.print(" ");
		}
		in.close();
	}

}
