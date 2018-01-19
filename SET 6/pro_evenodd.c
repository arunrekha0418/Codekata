//to find whether the product of 2nos as odd or even

#include<stdio.h>
void main()
{
	int n,m,pro;
	printf("ENTER THE INPUT NOS\n");
	scanf("%d%d",&n,&m);
	pro=n*m;
	if((pro%2)==0)
	printf("EVEN");
	else
	printf("ODD");
	
}
