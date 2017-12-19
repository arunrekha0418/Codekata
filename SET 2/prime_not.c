#include<stdio.h>
void main()
{
	int n,i,count=0;
	printf("ENTER THE GIVEN INTEGER TO CHECK WETHER IT IS PRIME OR NOT:\n");
	scanf("%d",&n);
	for(i=2;i<n;i++)
	{
		if((n%i)==0)
		{
			count=1;
			
		}
	}
	if(count==0)
	{
		printf("THE GIVEN INTEGER %d IS PRIME NUMBER",n);
	}
	else
	{
		printf("THE GIVEN INTEGER %d IS NOT A PRIME NUMBER",n);
	}
}
