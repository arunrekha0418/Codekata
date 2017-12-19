#include<stdio.h>
void main()
{
int year;
scanf("%d",&year);
if(year%4==0)
{
printf("the given year %d is LEAP YEAR",year);
}
else
{
printf("the given year %d is NON LEAP YEAR",year);
}
}
