#include<stdio.h>
void main()
{
	int a,b,max=0,gcd=0,i,lcm;
	printf("ENTER THE TWO INTEGERS :\n");
	scanf("%d%d",&a,&b);
	if(a>b)
	{
		max=a;
	}
	else
	{
		max=b;
	}
	for(i=2;i<max;i++)
	{
		if(((a%i)==0)&&((b%i)==0))
		{
			gcd=i;
		}
	}
	lcm=(a*b)/gcd;
	printf("THE LCM FOR %d AND %d IS %d",a,b,lcm);
}
