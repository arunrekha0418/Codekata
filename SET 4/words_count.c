//c program to count the no.of.words in the given sentence.

#include<stdio.h>
#include<string.h>
#include<ctype.h>
void main()
{
	char a[50];
	int n,i,count=1;
	printf("ENTER THE INPUT SENTENCE:\n");
	gets(a);
	n=strlen(a);
	printf("\nTHE LENGTH OF STRING IS %d",n);
	for(i=0;i<n;i++)
	{
		if(isspace(a[i]))
		{
			count++;
		}
	}
	printf("\nTHE NO.OF.WORDS IN THE GIVEN SENTENCE ARE %d",count);
}
