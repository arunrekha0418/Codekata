#include<stdio.h>
#include<ctype.h>
void main()
{
char ch;
scanf("%c",&ch);
if(isalpha(ch))
{
printf("the given element %c is ALPHABET",ch);
}
else
{
printf("the given element %c is NOT ALPHABET",ch);
}
}
