package guviplayer;
import java.util.*;
public class Set18_180 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,n,pro=1;
		System.out.println("ENTER THE BINARY NUMBER");
		String s=in.next();
		n=Integer.parseInt(s,2);
		System.out.println("THE DECIMAL EQUIVALENT FOR THE GIVEN  BINARY NUMBER: " + n);
		System.out.println("THE NEAREST POWER OF 2 FOR THE GIVEN BINARY :");
		for(i=0;i<n;i++)
		{
			pro=pro*2;
			if(pro>=n)
			{
				System.out.println(pro);
				break;
			}
		}
		in.close();
	}

}
