//c program to find the median element.the median element is the centre element of the sorted array.


#include<stdio.h>
void main()
{
	int n,a[10],i,j,mid=0,t;
	printf("ENTER THE NO.OF.ARRAY ELEMENTS:");
	scanf("%d",&n);
	printf("\nENTER THE ARRAY ELEMENTS:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("\nTHE SORTED ARRAY ELEMENTS:");
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	for(i=0;i<n;i++)
	{
		printf("\n%d",a[i]);
	}
	
		mid=n/2;
	printf("\nTHE MEDIAN ELEMENT IS :");	
	for(i=0;i<n;i++)
	{
		if(i==mid)
		printf("\n%d",a[mid]);
	}

	
}
