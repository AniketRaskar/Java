#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>  //fileControl

int main()
{
    char fname[30];
    int fd=0; //fd- file descripter

    printf("Enter the file name that you want to create\n");
    scanf("%s",fname);  //not necesary of & as array is internally considered as pointer

    fd = creat(fname,0777);//0 is for octal as addition can't be greater than 7
    if(fd  == -1)
    {
        printf("Unable to create file \n");
    }
    else
    {
        printf("File is sucesfully created with fd: %d\n",fd);//gives fd 3 bcz first 3 index of UFDT array 0,1,2 are reserved for STDIN(keyboard),SDTOUT(monitor),STDERR(monitor) so next 3 rd index gets allocated for our file 
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