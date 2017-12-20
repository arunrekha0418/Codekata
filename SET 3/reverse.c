#include<stdio.h>
void main()
{
	int a,sum=0,t;
	printf("ENTER THE  NUMBER TO BE REVERSED :\n");
	scanf("%d",&a);
	int b=a;
	while(a!=0)
	{
		t=a%10;
		sum=(sum*10)+t;
		a=a/10;
	}
	printf("\nTHE REVERSED NUMBER FOR %d IS %d",b,sum);
}
