package guviplayer;
//to find the no.of 1s in the binary rep for product of 2 nos...
import java.util.Scanner;

public class Set16_159binary {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,pro;
		a=in.nextInt();
		b=in.nextInt();
		pro=a*b;
		String ans=Integer.toBinaryString(pro);
		//Integer.parseInt(ans);
		System.out.println(ans);
		System.out.println(Integer.bitCount(pro));
in.close();
	}

}
