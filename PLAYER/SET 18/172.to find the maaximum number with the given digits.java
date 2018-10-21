package guviplayer;
import java.util.*;
public class Set18_172 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,j,n;
		System.out.println("ENTER TEH INPUT");
		String a=in.next();
		char ch[]=a.toCharArray();
		n=a.length();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(Character.getNumericValue(ch[i])<Character.getNumericValue(ch[j]))
				{
					char t=ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
			}
		}
		System.out.println("THE MAXIMUM NUMBER CAN BE FORMED WITH THE GIVEN DIGITS IS:");
for(i=0;i<n;i++)
{
	System.out.print(ch[i]);
}
in.close();
	}

}
