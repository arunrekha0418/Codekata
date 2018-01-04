// c program to swap the 2 integers using bitwise operator.

#include<stdio.h>
void main()
{
	int a,b;
	printf("ENTER THE INPUT INTEGERS:\n");
	scanf("%d%d",&a,&b);
	printf("BEFORE SWAPPING:\n");
	printf("a=%d\nb=%d",a,b);
	a=a ^ b;
	b=a ^ b;
	a=a ^ b;
	printf("\nAFTER SWAPPING:\n");
	printf("a=%d\nb=%d",a,b);		
	}
	
