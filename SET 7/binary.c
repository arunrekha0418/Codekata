//62.to check wether the given string is in binary form or not..

#include<stdio.h>
#include<string.h>
void main()
{
	char a[50];
	int n,i,count=0;
	printf("ENTER THE STRING\n");
	scanf("%s",a);
	n=strlen(a);
	printf("%d",n);
	for(i=0;i<n;i++)
	{
		if(a[i]=='1'||a[i]=='0')
		{
			count=1;
		}
	}
	printf("%d",count);
	if(count==1)
	printf("THE GIVEN STRING IS IN BINARY FORM");
	else
	printf("THE GIVEN STRING IS NOT IN BINARY FORM");
}
