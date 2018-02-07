//66.to check wether the given integer is prime or not

#include<stdio.h>
void main()
{
	int n,i,count=0;
	printf("ENTER THE INPUT INTEGERS:\n");
	scanf("%d",&n);
	for(i=2;i<=n;i++)
	{
		if(n%i==0)
		count++;
	}
	if(count==1)
	{
		printf("\nTHE GIVEN INTEGER  %d  IS PRIME",n);
	}
	else
	printf("\nTHE GIVEN INTEGER  %d  IS NOT PRIME",n);
}
