//61.to print upto the characters of the string for the given integer.

#include<stdio.h>
#include<string.h>
void main()
{
	char a[20];
	int i,k;
	printf("ENTER THE INPUT STRING:\n");
	scanf("%s",a);
	printf("ENTER THE INPUT INTEGER TO PRINT THE CHARACTERS:\n");
	scanf("%d",&k);
	for(i=0;i<k;i++)
	{
		printf("%c",a[i]);
	}
	
}
