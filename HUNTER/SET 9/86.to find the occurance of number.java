package guvihunter;
import java.util.*;
public class Set9_86 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int i,n,d,j,count=0;
	System.out.println("ENTER THE INPUT");
	n=in.nextInt();
	System.out.println("ENTER THE KEY VALUE");
	d=in.nextInt();
	for(i=0;i<=n;i++)
	{
		String a=Integer.toString(i);
		char ch[]=a.toCharArray();
		if(a.length()==1)
		{
			if(d==i)
				count++;
		}
		else
		{
			for(j=0;j<ch.length;j++)
			{
				if(Character.getNumericValue(ch[j])==d)
					count++;
			}
		}
	}
System.out.println("THE NO OF OCCURANCE OF " + d + " IN THE RANGE " + n + " IS: " + count);
in.close();
	}

}
