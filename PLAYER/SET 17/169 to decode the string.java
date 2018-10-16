package guviplayer;
import java.util.*;
public class Set17_169 {
//to decode the string...
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,j,n,count;
		String a;
		a=in.next();
		n=a.length();
		char ch[]=a.toCharArray();
		for(i=0;i<n;i++)
		{
			count=1;
			for(j=i+1;j<n;j++)
			{
				if(ch[i]!='*'&&ch[i]==ch[j])
				{
					count++;
					ch[j]='*';
				}
			}
	if(ch[i]!='*')
	{
		System.out.print(ch[i]);
		System.out.print(count);
	}
		}
	in.close();	

	}

}
