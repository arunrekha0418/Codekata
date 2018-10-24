package guviplayer;
import java.util.*;
public class Set20_200 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,i,j;
		System.out.println("ENTER THE INPUT STRING :");
		String a=in.next();
		n=a.length();
		char ch[]=a.toCharArray();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j]&&ch[i]!='*')
				{
					ch[j]='*';
				}
			}
		}
		for(i=0;i<n;i++)
		{
			if(ch[i]!='*')
				System.out.print(ch[i]);
		}
		
in.close();
	}

}
