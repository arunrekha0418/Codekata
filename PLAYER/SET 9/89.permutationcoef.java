//89.to find the permutation coefficient for given n=5,k=2...formula=n!/(n-k)!...

import java.util.*;
class permutcoe
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,k,diff=0,i,nfact=1,difffact=1,res=0;
System.out.println("ENTER THE INPUTS:");
n=in.nextInt();
k=in.nextInt();
diff=n-k;
for(i=1;i<=n;i++)
{
nfact=nfact*i;
}
for(i=1;i<=diff;i++)
{
difffact=difffact*i;
}
res=nfact/difffact;
System.out.println("THE ANSWER IS " + res);
}}
