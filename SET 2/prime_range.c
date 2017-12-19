#include<stdio.h>
void main()
{
	int min,max,i,n;
	printf("ENTER THE RANGE:\n");
	scanf("%d%d",&min,&max);
	printf("TO PRINT THE PRIME NO'S BETWEEN THE RANGE:\n");
	for(i=min;i<max;i++)
	{
		int count=0;
		for(n=2;n<i;n++)
		{
			if((i%n)==0)
		{
			count=1;
		}
		}
		if(count==0)
		{
			printf("%d\n",i);
		}
	}
}
