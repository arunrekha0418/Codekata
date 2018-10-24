package guviplayer;
import java.util.*;
public class Set20_195 {

	//to find the last person to get 1 from the stack of coins...
	
	
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int coins,persons,count=0,i,last_person=0;
	System.out.println("ENTER THE NO.OF COINS:");
	coins=in.nextInt();
	System.out.println("ENTER THE NO.OF PERSONS:");
	persons=in.nextInt();
	for(i=1;i<=coins;i++)
	{
		if(persons*i<=coins)
		{
			count=persons*i;
		}
		else
			break;
	}
	if(count<coins)
	{
		last_person=coins-count;
		System.out.println("THE LAST_PERSON TO GET COIN 1 IS " + last_person);
	}
	if(count==coins)
	{
		last_person=persons;
		System.out.println("THE LAST_PERSON TO GET COIN 1 IS " + last_person);
	}
	in.close();
	}

}
