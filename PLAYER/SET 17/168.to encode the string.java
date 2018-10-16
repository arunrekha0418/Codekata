package guviplayer;
import java.util.*;
public class Set17_168 {

	//to encode the string....
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a;
		int i,n,j,k;
		a=in.nextLine();
		n=a.length();
		char ch[]=a.toCharArray();
		for(i=0;i<n;i=i+2)
		{
			k=Character.getNumericValue(ch[i+1]);
			for(j=0;j<k;j++)
			{
				System.out.print(ch[i]);
			}
		}
in.close();
	}

}
