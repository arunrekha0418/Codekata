package guviplayer;
import java.util.*;
public class Set21_202 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,n;
		String a,vow="",con="",ans;
		System.out.println("ENTER THE INPUT STRING:");
		a=in.next();
		char ch[]=a.toCharArray();
		n=a.length();
		for(i=0;i<n;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				vow=vow+ch[i];
				ch[i]='*';
			}
		}
		for(i=0;i<n;i++)
		{
			if(ch[i]!='*')
				con=con+ch[i];
		}
		ans=vow+con;
		//System.out.println(vow);
		//System.out.println(con);
		System.out.println(ans);
in.close();
	}

}
