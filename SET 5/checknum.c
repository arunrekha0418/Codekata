//to check wether hte given number is in range or not.

#include<stdio.h>
void main()
{
	int num,min,max,i,count=0;
	printf("ENTER THE RANGE VALUE\n");
	scanf("%d%d",&min,&max);
	printf("\n\tTO FIND THE INPUT NUMBER  WETHER IT IS IN THE RANGE OR NOT");
	printf("\nENTER THE INPUT NUMBER\n");
	scanf("%d",&num);
	for(i=min;i<=max;i++)
	{
		if(i==num)
		{
			count=1;
		}
	}
	if(count==1)
	printf("\nYES");
	else
	printf("\nNO");
	
}
