//to print the sum value for the the given input integer.

#include<stdio.h>
void main()
{
	int n,t,sum=0;
	printf("ENTER THE INPUT NUMBER\n");
	scanf("%d",&n);
	int i=n;
	while(n>0)
	{
		t=n%10;
		sum=sum+t;
		n=n/10;
	}
	printf("THE SUM VALUE FOR THE NUMBER %d is %d",i,sum);
}
