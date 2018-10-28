package guviplayer;
import java.util.*;
public class Set21_203 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,j,count,n,t;
		System.out.println("ENTER THE SIZE OF THE ARRAY:");
		n=in.nextInt();
		int c[]=new int[n];
		int c1[]=new int[n];
		System.out.println("ENTER THE STRING ARRAY:");
		String a[]=new String[n];
		for(i=0;i<n;i++) {
			a[i]=in.next();
		}
		for(i=0;i<n;i++)
		{
			char ch[]=a[i].toCharArray();
			count=0;
			for(j=0;j<ch.length;j++)
			{
				if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
				count++;
			}
			c[i]=count;
			c1[i]=count;
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(c[i]<c[j])
				{
					t=c[i];
					c[i]=c[j];
					c[j]=t;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(c[i]);
		}
		for(i=0;i<n;i++)
		{
			
			for(j=0;j<n;j++)
			{
				if(c[i]==c1[j])
					System.out.println(a[j]);
			}
			
		}
		in.close();
	}

}
