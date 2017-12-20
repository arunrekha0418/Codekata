#include<stdio.h>
void main()
{
	int n,i,a;
	printf("ENTER THE NUMBER TO PRINT THE MULTIPLICATION TABLE:\n");
	scanf("%d",&a);
	printf("ENTER THE NO.OF TIMES TO PRINT THE MULTIPLICATION TABLE:\n");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		printf("\n%d * %d=%d",a,i,a*i);
	}
	
}
