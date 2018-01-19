//to print the nearest even number which is less than or equal to.

#include<stdio.h>
void main()
{
	int n;
	printf("ENTER THE INPUT NUMBER\n");
	scanf("%d",&n);
	if((n%2)==0)
	printf("THE NEAREST EVEN NUMBER IS %d",n);
	else
	printf("THE NEAREST EVEN NUMBER IS %d",n-1);
}
