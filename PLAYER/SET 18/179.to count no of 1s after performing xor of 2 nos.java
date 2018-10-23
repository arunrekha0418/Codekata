package guviplayer;
import java.util.*;
public class Set18_179 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c;
		System.out.println("ENTER THE INPUTS:");
		a=in.nextInt();
		b=in.nextInt();
		c=a^b;
		Integer.toBinaryString(c);
		System.out.println("THE NO.OF.1's AFTER PERFORMING XOR OPERATION FOR 2 NOS IS:  " + Integer.bitCount(c));
	in.close();
	}

}
