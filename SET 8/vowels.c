//72.to check wether the string contain any vowels or not...

#include<stdio.h>
#include<string.h>
void main()
{
	char ch[50];
	int i,n,count=0;
	printf("ENTER THE INPUT STRING:\n");
	scanf("%s",ch);
	n=strlen(ch);
	for(i=0;i<n;i++)
	{
		if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		count++;
		
	}
	if(count==0)
	printf("THE GIVEN STRING %s DOES NOT CONTAIN ANY VOWELS",ch);
	else
		printf("THE GIVEN STRING %s  CONTAINS  VOWELS",ch);
}
