#include<stdio.h>
void main()
{
	int n,fact=1,i;
	printf("ENTER THE NUMBER:\n");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	printf("\nTHE FACTORIAL OF A NUMBER %d IS %d",n,fact);
}
