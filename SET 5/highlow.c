//to find th lowest and highest elements in the array.

#include<stdio.h>
void main()
{
	int n,i,j,t,a[20];
	printf("ENTER THE TOTAL NO.OF.ARRAY ELEMENTS\n");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<=n;j++)
	{
		if(a[i]>a[j])
		{
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	}
	}
	printf("THE LOWEST NUMBER IN THE ARRAY IS%d\n",a[1]);
	printf("THE HIGHEST NUMBER IN THE ARRAY IS%d\n",a[n-1]);
	
}
