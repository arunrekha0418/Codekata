//71.to check the pallindrome of string in c

#include<stdio.h>
#include<string.h>
void main()
{
	char ch1[50],ch2[50];
	int i,count=0,n;
	printf("ENTER THE INPUT STRING:\n");
	scanf("%s",ch1);
	n=strlen(ch1);
	for(i=0;i<=n;i++)
	{
		
		if(ch1[i]!=ch1[n-i-1])
		count=1;
	}
	if(count==0)
	printf("THE GIVEN STRING %s IS   A PALLINDROME",ch1);
	else
	printf("THE GIVEN STRING %s IS  NOT A PALLINDROME",ch1);
	
	
}
