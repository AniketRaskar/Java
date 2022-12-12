#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>  //fileControl

int main()
{
    
    char fname[30];
    int fd=0; //fd- file descripter
    char Data[11];

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
    lseek(fd,4,0);
    //lseek(fd,-7,2);  //magun access karnyasathi (magun 7 bytes de)
    
    //1: File Descripter    kashat
    //2:Displacement        Kitine halchal (kiti byte pasun)
    //3:From where          Kutun (0:start of file, 1:current position,  2: End of file)
    read(fd,Data,6);
   
    write(1,Data,6);  
    close(fd);
    
    return 0;
}
//lseek is used for reading the file from perticular position
