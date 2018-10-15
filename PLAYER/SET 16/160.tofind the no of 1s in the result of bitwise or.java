package guviplayer;
import java.util.*;
public class Set16_160bitwiseor {
//to find the bitwise OR for 2nos and print the no.of.1s in binary rep...
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,res;
		a=in.nextInt();
		b=in.nextInt();
		res=a|b;
		System.out.println(Integer.bitCount(res));
		in.close();

	}

}
