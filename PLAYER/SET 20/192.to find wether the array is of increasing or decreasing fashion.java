package guviplayer;
import java.util.*;
public class Set20_192 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n,i,j,low_count=0,high_count=0;
	System.out.println("ENTER THE SIZE OF THE ARRAY:");
	n=in.nextInt();
	int a[]=new int[n];
	System.out.println("ENTER THE  ARRAY ELEMENTS:");
	for(i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
	for(i=0,j=i+1;i<n&&j<n;i++,j++)
	{
		if(a[i]<a[j])
			high_count++;
		if(a[i]>a[j])
			low_count++;
	}
	if(high_count==low_count)
		System.out.println("YES,the array is of the type increasing and decresing fashion ");
	else
		System.out.println("NO,the array is not of the type increasing and decresing fashion ");
	
	in.close();
	}

}
