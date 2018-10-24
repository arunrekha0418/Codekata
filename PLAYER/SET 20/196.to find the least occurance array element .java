package guviplayer;
import java.util.*;
public class Set20_196 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,j,n,count;
		System.out.println("ENTER THE SIZE OF THE ARRAY");
		n=in.nextInt();
		int a[]=new int[n];
		System.out.println("ENTER THE ARRAY ELEMENTS");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			count=1;
				for(j=i+1;j<n;j++)
				{
					if(a[i]==a[j]&&a[i]!=-0) {
						count++;
						a[j]=-0;
					}
				}
				if(count==1&&a[i]!=-0)
				{
					System.out.println(a[i]);
				}
			}
			in.close();

	}

}
