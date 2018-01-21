//c program to print the fibonacci series

#include<stdio.h>
void main()
{
	int n,c,a=1,b=0;
	printf("ENTER THE NO.OF.REPETATION\n");
	scanf("%d",&n);
	while(n!=0)
	{
		c=a+b;
		a=b;
		b=c;
		n--;
		printf(" %d",c);
		
	}
}
