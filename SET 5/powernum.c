//to check wether the given number is a power of 2 or not.

#include<stdio.h>
void main()
{
	int n,i,count=0,j=1;
	printf("ENTER THE NUMBER TO CHECK WHETHER IT IS POWER OF 2 OR NOT\n");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		j=j*2;
	if(j==n)
		count=1;
	}
	if(count==1)
	{
			printf("\nYES");
	}
	else
		printf("\nNO");
	
}
