package guviplayer;
import java.util.*;
public class Set17_170 {
//to print the maximum number of characters in string
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,j,n,max=0,count,k=0;
		String a=in.nextLine();
		a.toLowerCase();
		n=a.length();
		char ch[]=a.toCharArray();
		char ch1[]=a.toCharArray();
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
			if(max<count||max==count)
			{
				max=count;
			}
		}
		 k=max;
		 System.out.print(max);
		 System.out.print(" ");
		 for(i=0;i<n;i++)
			{
				count=1;
				for(j=i+1;j<n;j++)
				{
					if(ch1[i]!='*'&&ch1[i]==ch1[j])
					{
						count++;
						ch1[j]='*';
					}
				}
		if(count==k)
		{
			System.out.print(ch1[i]);
			
		}
			}
		in.close();	


	}

}
