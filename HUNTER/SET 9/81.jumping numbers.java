package guvihunter;
import java.util.*;
public class Set9_81 {
//to print the count of jumping numbers...
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,j,k,n,count=0,tcount;
		System.out.println("ENTER THE INPUT");
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			tcount=0;
			String a=Integer.toString(i);
			char ch[]=a.toCharArray();
			if(ch.length==1)
				count++;
			else
			{
				for(j=0,k=j+1;j<ch.length-1&&k<ch.length;j++,k++)
				{
					if(Math.abs(Character.getNumericValue(ch[j])-Character.getNumericValue(ch[k]))==1)
						tcount++;
				}
				if(tcount==ch.length-1)
					count++;
			}
		}
		System.out.println(count);
		in.close();

	}

}
