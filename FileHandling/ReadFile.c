#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>  //fileControl

int main()
{
    
    char fname[30];
    int fd=0; //fd- file descripter
    char Data[11];  //ata aplyala data anaychay so empty thewaycha

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

    read(fd,Data,6);
    printf("Data from file is: %6s \n",Data); //%6s for avoiding garbage(fakt 6ch letter dakhaw baba)
    write(1,Data,6);  //if that is also giving garababe then apply loop upto 6 digit, so it will not give errror(1- UFDT Array- apan sangtoy plz write on monitor)
    close(fd);//close karun thew as a good programing practice
    
    return 0;
}
//User mode- yat process tichi ti chalate
//kernel mode- yat process sathi kernel chi garaj hoti
