package guvihunter;
import java.util.*;
public class Set9_89 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,j;
		System.out.println("ENTER THE STRING:");
		String a=in.next();
		StringBuilder str=new StringBuilder(a);
		str.reverse();
		String ans=str.toString();
		char ch[]=ans.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]&&ch[i]!='*')
				{
					ch[j]='*';
				}
			}
		}
		System.out.println("THE REVERSED STRING AFTER REMOVING THE REPETATION OF CHARACTERS IS:");
for(i=0;i<ch.length;i++)
{
	if(ch[i]!='*')
		System.out.print(ch[i]);
}
in.close();
	}

}
