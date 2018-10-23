package guviplayer;
import java.util.*;
public class Set18_178 {

	//to convert the of a common characters in the given string....
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,i,j,count;
		System.out.println("ENTER THE STRING:");
		String a=in.nextLine();
		n=a.length();
		char ch[]=a.toCharArray();
		char ch1[]=new char[n];
		for(i=0;i<n;i++)
		{
			ch1[i]=ch[i];
		}
		for(i=0;i<n;i++)
		{
			count=1;
			for(j=i+1;j<n;j++)
			{
							if(ch[i]==ch[j]&&ch[i]!='*')
							{
								ch[j]='*';
								count++;
							}
			}
			if(count>1)
				ch[i]='*';
		}
		/*for(i=0;i<n;i++)
		{
			System.out.print(ch[i]);
		}*/
		for(i=0;i<n;i++)
		{
			if(ch[i]=='*')
			System.out.print(Character.toUpperCase(ch1[i]));
			else
				System.out.print(ch1[i]);
		}
		
		in.close();
	}

}
