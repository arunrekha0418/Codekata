#include<stdio.h>
void main()
{
int num;
scanf("%d",&num);
if(num==0)
{
printf("\nthe given number %d is ZERO",num);
}
else if(num>0)
{
printf("\nthe given number %d is POSITIVE",num);
}
else 
{
printf("\nthe given number %d is NEGATIVE",num);
}
}
