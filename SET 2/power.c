#include<stdio.h>
void main()
{
int num,pow,i,ans=1;
printf("ENTER THE INTEGER AND POWER:\n");
scanf("%d%d",&num,&pow)	;
for(i=0;i<pow;i++)
{
	ans=ans*num;
}
printf("THE ANS IS %d",ans);
}
