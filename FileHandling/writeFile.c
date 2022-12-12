#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>  //fileControl

int main()
{
    int ret=0;
    char fname[30];
    int fd=0; //fd- file descripter
    char Data[11]="Marvellous";

    printf("Enter the file name that you want to open\n");
    scanf("%s",fname);  
    fd = open(fname,O_RDWR);  //rdwr- readwrite
    if(fd  == -1)
    {
        printf("Unable to open file \n");
        return -1;
    }
    else
    {
        printf("File is sucesfully opend with fd: %d\n",fd);
    }

    write(fd,Data,10);   //write kara-kashat kara-kay kara-kiti
    
    return 0;
}
