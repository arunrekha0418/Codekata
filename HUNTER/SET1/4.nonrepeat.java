//hunter set 1
//4.to find the non repeting element in the array

import java.util.Scanner;
class twice
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,count=0,j;
System.out.println("ENTER THE NO.OF ARRAY ELEMENTS:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
 for(i = 0; i < n; i++)
{
	for(j = 0; j < n; j++)
       {
        if(i != j)
            {
                if(a[i] != a[j])
                    {
                        count = 1;
                    }
                    else
                    {
                        count = 0;
                        break;
                    }
            }
        }
            if(count == 1)
            {
 
                System.out.print(a[i]+" ");
            }
        }

}}
