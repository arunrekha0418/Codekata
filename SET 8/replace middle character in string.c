//75.to replace the middle character in the string

#include<stdio.h>
#include<string.h>
#include<math.h>
void main()
{
	char ch[50];
	int n,mid,i,mid1,mid2=0;
	printf("ENTER THE INPUT STRING:\n");
	scanf("%s",ch);
	n=strlen(ch);
	printf("THE LENGTH OF THE STRING IS :%d\n",n);
	if((n-1)%2==0)//since the index starts from zero
	{
		mid=n/2;
		for(i=0;i<n;i++)
		{
			if(i==mid)
			{
			ch[i]='*';
			printf("%c",ch[i]);	
			}
			else
			printf("%c",ch[i]);
		}
	}
	else
	{
		mid1=n/2;
		mid2=mid1-1;
		//printf("%d%d",mid1,mid2);
			for(i=0;i<n;i++)
		{
			if(i==mid1||i==mid2)
			{
			ch[i]='*';
			printf("%c",ch[i]);	
			}
			else
			printf("%c",ch[i]);
		}
	}
}
