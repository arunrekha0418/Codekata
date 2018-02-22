//79.perfect square for product of two nos..

#include<stdio.h>
void main()
{
	int a,b,n,count=0,i;
	scanf("%d%d",&a,&b);
	n=a*b;
	for(i=1;i<=n;i++)
	{
		if(n==i*i)
		count=1;
	}
	if(count==1)
	printf("yes");
	else
	printf("no");
}
