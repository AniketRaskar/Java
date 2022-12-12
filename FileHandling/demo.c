#include<stdio.h>
#include <fcntl.h>

int main()
{
    char arr[30];
    scanf("%s",arr); 
    int fd=0;
    fd = creat(arr,0777);

    return 0;
}