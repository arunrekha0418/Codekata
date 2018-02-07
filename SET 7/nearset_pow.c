//70.to find the nearest power of 2 for the given integer

#include<stdio.h>
#include<math.h>
void main()
{
	int a,b,i;
	printf("ENTER THE INPUT INTEGERS:\n");
	scanf("%d",&a);
	for(i=1;i<a;i++)
	{
		b=pow(2,i);
        if(b>a)
		printf("\nTHE NEAREST POWER OF 2 FOR THE GIVEN INTEGER IS %d",b);
	}
}
