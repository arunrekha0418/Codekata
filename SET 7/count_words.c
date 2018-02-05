//63.to count the no of words in the given string..

#include<stdio.h>
#include<string.h>
#include<ctype.h>
void main()
{
	char s1[50];
	int n,words=1,i;
	printf("ENTER THE INPUT STRING:\n");
	gets(s1);
	n=strlen(s1);
	//printf("%d",n);
	for(i=0;i<n;i++)
	{
		if(isspace(s1[i]))
		words++;
	}
	printf("THE NO OF WORDS IN THE GIVEN STRING IS :n %d",words);
}
