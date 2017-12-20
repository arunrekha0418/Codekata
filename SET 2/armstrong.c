#include<stdio.h>
void main()
{
	int n,t,sum=0;
	printf("ENTER THE NUMBER:\n");
	scanf("%d",&n);
	int a=n;
	while(n!=0)
	{
	t=n%10;
	sum=sum+(t*t*t);
	n=n/10;	
	}
	printf("TO CHECK WETHER THE GIVEN NUMBER IS ARMSTRONG OR NOT");
	if(sum==a)
	{
		printf("THE GIVEN NUMBER %d  IS ARMSTRONG NUMBER",a);
	}
    else
	{
		printf("THE GIVEN NUMBER %d  IS NOT A ARMSTRONG NUMBER",a);
	}
}
