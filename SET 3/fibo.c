#include<stdio.h>
void main()
{
	int n,c,a=0,b=1,i;
	printf("ENTER THE NUMBER TO PRINT THE SEQUENCE:\n");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		c=a+b;
		a=b;
		b=c;
		printf("%d\n",c);
	}
}
