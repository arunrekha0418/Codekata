//76.to check wether the given number is composite or not...

#include<stdio.h>
void main()
{
	int n,i,count=0;
	printf("ENTER THE INPUT INTEGER:\n");
	scanf("%d",&n);
	for(i=2;i<n;i++)
	{
		if(n%i==0)
		count++;
	}
	if(count!=0)
	printf("THE GIVEN NUMBER %d IS COMPOSITE",n);
	else
	printf("THE GIVEN NUMBER %d IS NOT COMPOSITE",n);
	
}
