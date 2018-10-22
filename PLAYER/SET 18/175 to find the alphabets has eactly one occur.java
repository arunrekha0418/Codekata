package guviplayer;
import java.util.*;
public class Set18_175 {
//to find wether the alphabets has exactly one occurance and its length is 26 when it is concatenated from 2 strings... 
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,j,n,totcount=0,count;
		System.out.println("ENTER THE 1st STRING");
		String a=in.next();
		System.out.println("ENTER THE 2nd STRING");
		String b=in.next();
		String c=a+b;
		n=c.length();
		char ch[]=c.toCharArray();
		if(n==26)
		{
			for(i=0;i<n;i++)
			{
				count=1;
				for(j=i+1;j<n;j++)
				{
					if(ch[i]==ch[j])
						count++;
				}
				if(count==1)
					totcount++;
			}
			if(totcount==26)
				System.out.println("Complementary");
			else
				System.out.println("Non-Complementary");
		}
		else
			System.out.println("Non-Complementary");
in.close();
	}

}
