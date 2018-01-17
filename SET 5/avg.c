//to avg of number upto the limit.

#include<stdio.h>
void main()
{
	int n,sum=0,i;
	float avg;
	printf("ENTER THE MAX VALUE\n");
	scanf("%d",&n);
	for(i=0;i<=n;i++)
	{
		sum=sum+i;
	}
	avg=sum/n;
	printf("%f",avg);
}
