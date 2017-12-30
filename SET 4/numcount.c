//c program to count the no.of.numbers in the given sentence.

#include<stdio.h>
#include<string.h>
#include<ctype.h>
void main()
{
	char a[50];
	int n,i,count=0;
	printf("ENTER THE INPUT SENTENCE:\n");
	gets(a);
	n=strlen(a);
	printf("\nTHE LENGTH OF SENTENCE IS %d",n);
	for(i=0;i<n;i++)
	{
		if(isdigit(a[i]))
		{
			count++;
		}
	}
	printf("\nTHE NO.OF.INTEGERS IN THE GIVEN SENTENCE ARE %d",count);
}
