#include<stdio.h>
#include<math.h>
void main()
{
int num,power,ans=1;
printf("ENTER THE INTEGER AND POWER:\n");
scanf("%d%d",&num,&power)	;
ans=pow(num,power);
printf("THE ANS FOR %d POWER %d IS %d:",num,power,ans);
}
