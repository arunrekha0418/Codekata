//to find the sum of two nos

#include<stdio.h>
int sum(int a,int b)
{
	int sum=0;
	sum=a+b;
	printf("%d",sum);
	return 0;
}
void main()
{
int a,b;
printf("TO FIND THE SUM OF TWO NOS\n");
	scanf("%d%d",&a,&b);
	sum(a,b);
}
