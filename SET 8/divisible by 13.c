//78.to check wether the given number is divisible by 13...

#include<stdio.h>
void main()
{
	int n,i;
	printf("ENTER THE INPUT INTEGER:\n");
	scanf("%d",&n);
	
		if(n%13==0)
		printf("THE GIVEN NUMBER %d IS DIVISIBLE BY 13 ",n);
		else
		printf("THE GIVEN NUMBER %d IS NOT DIVISIBLE BY 13 ",n);
}
