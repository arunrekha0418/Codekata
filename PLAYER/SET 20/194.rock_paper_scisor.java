package guviplayer;
import java.util.*;
public class Set20_194 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String ch1,ch2;
		//R--> ROCK,P-->PAPER,S-->SCISSOR
		System.out.println("ENTER THE INPUTS");
		ch1=in.next();
		ch2=in.next();
		if((ch1.equals("R")&&ch2.equals("P"))||(ch1.equals("P")&&ch2.equals("R")))
			System.out.println("the winner is P-->PAPER");
		else if((ch1.equals("R")&&ch2.equals("S"))||(ch1.equals("S")&&ch2.equals("R")))
			System.out.println("the winner is R-->ROCK");
		else if((ch1.equals("P")&&ch2.equals("S"))||(ch1.equals("S")&&ch2.equals("P")))
			System.out.println("the winner is S-->SCISSOR");
		else
			System.out.println("the match  is in D-->DRAW");
			
		in.close();
		
	}

}
