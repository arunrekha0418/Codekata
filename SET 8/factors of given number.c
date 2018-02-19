//77.to print the factors of the given number...

#include<stdio.h>
void main()
{
	int n,i;
	printf("ENTER THE INPUT INTEGER:\n");
	scanf("%d",&n);
	printf("THE FACTORS OF THE GIVEN NUMBER ARE:\n");
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		printf("%d\n",i);
	}
	
}
