package guvihunter;

import java.util.Scanner;

public class Set61 {

	public static void main(String[] args) {
		String a,b,ans;
		Scanner in=new Scanner(System.in);
		a=in.next();
		b=in.next();
		ans=Integer.toString(Integer.parseInt(a)*Integer.parseInt(b));
		System.out.println(ans);
		in.close();
		
	}

}
