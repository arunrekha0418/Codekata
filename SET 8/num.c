//73.a number to be checked wether it is present in the range or not...

#include<stdio.h>

void main()
{
	
	int min,max,i,k,count=0;
	printf("ENTER THE RANGE:\n");
	scanf("%d%d",&min,&max);
	printf("ENTER THE VALUE TO BE CHECKED:\n");
	scanf("%d",&k);
	for(i=min;i<=max;i++)
	{
		if(i==k)
		count=1;
	}
	if(count==1)
	printf("YES");
	else
	printf("NO");
}
