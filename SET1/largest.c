#include<stdio.h>
void main()
{
int a,b,c;
scanf("%d%d%d",&a,&b,&c);
if((a>b)&&(a>c))
{
printf("the greatest number is %d",a);
}
else if((b>a)&&(b>c))
{
printf("the greatest number is %d",b);
}
else 
{
printf("the greatest number is %d",c);
}
}
