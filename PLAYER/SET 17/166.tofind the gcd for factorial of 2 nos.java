package guviplayer;
import java.util.*;
public class Set17_166 {

	//to find the gcd for factorial of 2 nos
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,A=1,B=1,max=0,i,gcd=1;
		System.out.println("enter the nos:");
		a=in.nextInt();
		b=in.nextInt();
		for(i=1;i<=a;i++)
		{
			A=A*i;
		}
		for(i=1;i<=b;i++)
		{
			B=B*i;
		}
		if(A>B)
			max=A;
		else
			max=B;
		for(i=1;i<=max;i++)
		{
			if(A%i==0&&B%i==0)
				gcd=gcd*i;
		}
		System.out.println(gcd);
		in.close();
	}

}
