//c program to find wether its alphanumeric or not

#include<stdio.h>
#include<ctype.h>
void main()
{
	char a[20]="HELLOWORLD123";
	if(isalnum(a))
	printf("YES");
	else
	printf("NO");
}
