//to swap 2 nos using bitwise operator...not XOR.

#include<stdio.h>
void main()
{
	int a,b;
	printf("ENTER THE INPUT NOS\n");
	scanf("%d%d",&a,&b);
	printf("THE NOS BEFORE SWAPPING:\n%d\n%d\n",a,b);
	a=a^b;
	b=a^b;
	a=a^b;
	printf("\nTHE NOS AFTER SWAPPING:\n%d\n%d\n",a,b);
}
