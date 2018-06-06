//90.to find combination coefficient ....n==5,k=2
//formula===n!/(k!(n-k)!)

import java.util.*;
class combcoe
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,k,diff=0,i,nfact=1,difffact=1,res=0,kfact=1,deno=0;
System.out.println("ENTER THE INPUTS:");
n=in.nextInt();
k=in.nextInt();
diff=n-k;
for(i=1;i<=n;i++)
{
nfact=nfact*i;
}
for(i=1;i<=k;i++)
{
kfact=kfact*i;
}
for(i=1;i<=diff;i++)
{
difffact=difffact*i;
}
deno=kfact*difffact;
res=nfact/deno;
System.out.println("THE ANSWER IS " + res);
}}
