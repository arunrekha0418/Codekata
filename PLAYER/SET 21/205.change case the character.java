package guviplayer;
import java.util.*;
public class Set21_205 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,n;
		System.out.println("ENTER THE INPUT STRING");
		String a=in.next();
		n=a.length();
		char ch[]=a.toCharArray();
		System.out.println("TO CHANGE THE CASE OF THE CHARACTERS IN THE GIVEN STRING:");
		for(i=0;i<n;i++)
		{
			if(Character.isUpperCase(ch[i]))
				System.out.print(Character.toLowerCase(ch[i]));
			if(Character.isLowerCase(ch[i]))
				System.out.print(Character.toUpperCase(ch[i]));
		}
in.close();
	}

}
