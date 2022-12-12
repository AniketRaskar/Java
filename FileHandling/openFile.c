#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>  //fileControl

int main()
{
    char fname[30];
    int fd=0; //fd- file descripter

    printf("Enter the file name that you want to open\n");
    scanf("%s",fname);  
    fd = open(fname,O_RDWR);  //rdwr- readwrite
    if(fd  == -1)
    {
        printf("Unable to open file \n");
    }
    else
    {
        printf("File is sucesfully opend with fd: %d\n",fd);
    }

    return 0;
}

//user
//owner   4+2+1
//group
//other

//operation
//Read    4
//Write    2
//Execute   1