#include<stdio.h>
void main()
{
	int min,max,i;
	printf("ENTER THE RANGE:\n");
	scanf("%d%d",&min,&max);
	printf("TO PRINT THE ODD NO'S BETWEEN THE RANGE:\n");
	for(i=min;i<max;i++)
	{
		if((i%2)!=0)
		{
			printf("%d\n",i);
		}
	}
}
