package guviplayer;
import java.util.*;
public class Set21_206 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,n,count=0;
		System.out.println("ENTER THE STRING:");
		String a=in.next();
		n=a.length();
		char ch[]=a.toCharArray();
		for(i=0;i<n;i++)
		{
			if(Character.isDigit(ch[i])||ch[i]=='A'||ch[i]=='B'||ch[i]=='C'||ch[i]=='D'||ch[i]=='E')
				count++;
		}
		if(count==n)
			System.out.println("YES,THE GIVEN STRING FORMS THE CORRECT HEXA DECIMAL  REPRESENTATION");
		else
			System.out.println("NO, THE GIVEN STRING DOES'NT FORMS THE CORRECT HEXA DECIMAL  REPRESENTATION");
		in.close();	
	}

}
