//c program to find the largest number in the array

#include<stdio.h>
void main()
{
	int a[20],n,i,j,t;
	printf("ENTER THE TOTAL NOS\n");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
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
	printf("THE LARGEST NUMBER IN THE ARRAY IS %d",a[n-1]);
	
}
