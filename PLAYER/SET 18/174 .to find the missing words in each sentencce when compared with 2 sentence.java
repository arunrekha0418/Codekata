package guviplayer;
import java.util.*;
public class Set18_174 {
//to find the missn word in 2 senctences...
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,j,n,count;
		System.out.println("ENTER THE 1st SENTENCE");
		String a=in.nextLine();
		System.out.println("ENTER THE 2nd SENTENCE");
		String b=in.nextLine();
		String c=a;
		c=c+" ";
		c=c+b;
		String arr[]=c.split(" ");
		n=arr.length;
		for(i=0;i<n;i++)
		{
			count=1;
			for(j=i+1;j<n;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					arr[j]="*";
					count++;
				}
			}
			if(count!=2&&arr[i]!="*")
				System.out.println(arr[i]);
		}
		in.close();

	}

}
