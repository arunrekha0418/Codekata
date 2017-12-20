#include<stdio.h>
void main()
{
	int min,max,i,temp;
	printf("ENTER THE RANGE:\n");
	scanf("%d%d",&min,&max);
	printf("TO PRINT THE ARMSTRONG NO'S BETWEEN THE RANGE:\n");
	for(i=min;i<=max;i++)
	{
		 
		int num=i;
		int sum=0;
		while(num>0)
		{
		temp=num%10;
		sum=sum+(temp*temp*temp);
		num=num/10;
		}
		if(i==sum)
		{
		printf("%d\n",i);
		}
	}
}
