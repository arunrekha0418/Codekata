package guvihunter;
import java.util.*;
public class Set5_50 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,min,sub,count=0;
		System.out.println("ENTER THE 2 NOS:");
		a=in.nextInt();
		b=in.nextInt();
		min=(a>b)?b:a;
		sub=(a>b)?a:b;
		//System.out.println("sub" + sub);
		//System.out.println("min" + min);
		while(sub>=min)
		{
			sub=sub-min;
			count++;
		}
		//System.out.println("new sub " + sub);
if(sub==0)
	System.out.println(count);
else
	System.out.println("MAX_INT");
in.close();
	}

}
