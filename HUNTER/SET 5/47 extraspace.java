package guvihunter;

import java.util.Scanner;

public class Extraspace {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTERT THE STRING");
		String a=in.nextLine();
		String ans =a.replaceAll("\\s+", " ");
		 
		System.out.println( ans.trim() );
		in.close();
		

	}

}
