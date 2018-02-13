//74.round off the given integer to the higher value..

#include<stdio.h>
#include<math.h>
void main()
{
	double r;
	int k;
	printf("ENTER THE INPUT INTEGER:\n");
	scanf("%lf",&r);
	k=ceil(r);
	printf("THE NEAREST INTEGER FOR %lf IS %d",r,k);
}
