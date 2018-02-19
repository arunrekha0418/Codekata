//67.nearest greater multiple of 10.

#include<stdio.h>
int main()
{
    int n,num;
    printf("ENTER THE INPUT INTEGER:\n");
    scanf("%d",&num);
    n=num+1;
    while(n!=0)
    {
        if(n%10==0)
        {
            printf("%d",n);
            break;
        }
        n++;
    }
    return 0;
}
