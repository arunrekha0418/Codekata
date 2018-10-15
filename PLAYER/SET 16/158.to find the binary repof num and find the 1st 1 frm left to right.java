package guviplayer;
import java.util.*;
//to find the binary representation for the product of 2  nos...& to find the 1st one occuring from  right to left 

public class Set16_158binary {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,pro,i;
		a=in.nextInt();
		b=in.nextInt();
		pro=a*b;
		String ans=Integer.toBinaryString(pro);
		//System.out.println(ans);
		StringBuilder sb=new StringBuilder(ans);
		sb.reverse();
		String ans1=sb.toString();
		char ch[]=ans1.toCharArray();
		for(i=ch.length-1;i>=0;i--)
		{
			if(ch[i]=='1')
			{
			System.out.println(i+1);
			break;
			}
		}
		in.close();


	}

}
