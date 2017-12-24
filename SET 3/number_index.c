//to print the numbers  with its index.
#include<stdio.h>
void main()
{
	int n,i,a[10];
	printf("ENTER THE TOTAL NO.OF.ELEMENTS:\n");
	scanf("%d",&n);
	printf("ENTER THE ELEMENTS:\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf(" THE ELEMENTS WITH ITS INDEX POSITION ARE:\n");
	for(i=0;i<n;i++)
	{
		printf("\n%d\t%d",a[i],i);
	}
}
