#include<stdio.h>
void main()
{
	int num,t,sum=0;
	printf("ENTER THE GIVEN INTEGER:\n");
	scanf("%d",&num);
	int b=num;
	while(num!=0)
	{
		t=num%10;
		sum=(sum*10)+t;
		num=num/10;
	}
	if(sum==b)
	{
		printf("THE GIVEN INTEGER %d IS PALLINDROME",b);
	}
	else
	{
		printf("THE GIVEN INTEGER %d IS NOT A PALLINDROME",b);
	}
		
}
