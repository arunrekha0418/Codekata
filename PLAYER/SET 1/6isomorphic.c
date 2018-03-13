//6.to find wether the 2 strings are isomorphic or not .isomorphic -->aab,xxy=isomorphic;aab,xyz!=isomorphic

#include<stdio.h>
#include<string.h>
void main()
{
	int n1,n2,i,j,sum[10],k=0,t=0,count=0;
	char ch1[10],ch2[10];
	printf("ENTER THE INPUT STRINGS\n");
	scanf("%s%s",ch1,ch2);
	n1=strlen(ch1);
	n2=strlen(ch2);
	for(i=0,j=0;i<n1,j<n2;i++,j++)
	{
		sum[k]=ch1[i]+ch2[j];//adding the ascii value of ch1's first character and ch2's first character and storing it in array
		k++;
		t++;
	}
for(k=0;k<t;k++)
{
	//printf("%d\n",sum[k]);
	if(sum[k]==sum[k+1])
	count=1;
	
}
if(count==1)
printf("YES");
else
printf("NO");
}
