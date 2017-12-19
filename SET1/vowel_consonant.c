#include<stdio.h>
void main()
{
char ch;
scanf("%c" ,&ch);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
printf("the given character %c is VOWEL",ch);
}
else
{
printf("the given character %c is CONSONANT",ch);
}
}
