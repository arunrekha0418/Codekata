// c program to print the fibonacci series.

#include<stdio.h>
void main()
{
	int a=0,b=1,c,n;
	printf("ENTER THE NO.OF.ELEMENTS:\n");
	scanf("%d",&n);
	printf("%d",b);
	while(n!=0)
	{
		c=a+b;
		printf("\n%d",c);
		a=b;
		b=c;
		n--;
	}
	}
	
