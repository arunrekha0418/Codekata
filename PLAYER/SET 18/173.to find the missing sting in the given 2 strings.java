package guviplayer;
import java.util.*;

//to find the missing sting when  compared with 2 sentences...
public class Set18_173 {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int i,j,m,n,count;
 System.out.println("ENTER THE 1st INPUT STRING:");
 String a[]=in.nextLine().split(" ");
 m=a.length;
 System.out.println("ENTER THE 2nd INPUT STRING:");
 String b[]=in.nextLine().split(" ");
 n=b.length;
if(m>n)
{
	for(i=0;i<m;i++)
	 {
		 count=0;
		 for(j=0;j<n;j++)
		 {
			 if(a[i].equalsIgnoreCase(b[j]))
				 count++;
		
		 }
		 
		 if(count==0)
			 System.out.println(a[i]);
	 }
}
else
{
	for(i=0;i<n;i++)
	 {
		 count=0;
		 for(j=0;j<m;j++)
		 {
			 if(b[i].equalsIgnoreCase(a[j]))
				 count++;
		
		 }
		 
		 if(count==0)
			 System.out.println(b[i]);
	 }
}
 in.close();
	}

}
