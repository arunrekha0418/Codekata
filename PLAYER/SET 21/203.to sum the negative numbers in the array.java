package guviplayer;
import java.util.*;
public class Set21_204 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,sum=0,i;
		System.out.println("ENTER THE SIZE OF THE ARRAY");
		n=in.nextInt();
		System.out.println("ENTER THE  ARRAY ELEMENTS");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<0)
				sum=sum+a[i];
		}
		System.out.println("THE SUM OF NEGATIVE NUMBERS IN THE ARRAY " +sum);
		in.close();

	}

}
