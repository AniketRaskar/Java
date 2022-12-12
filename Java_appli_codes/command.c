#include<stdio.h>
#include<stdlib.h>
//in c/cpp at 0th index(Arr[0]) contains name of executable where as in java directly starts with command argument
//argc - argument count
//the names argc & argv can be changed
int main( int argc, char *argv[])  //main is function which accepts two parameters first is interger and second is one dimentional array whose each element is character pointer
{
    int ans =0;
    printf("Name of executable is: %s \n",argv[0]);  //at address contains the name of executable

    printf("Number of command line arguments are: %d \n",argv);

     ans = atoi(argv[1]) + atoi(argv[2]);  //atoi- ascii to integer (contains in atoi header file)
    printf("Addition is: %d \n",ans);
    return 0;
}

//gcc command.c -o myexe
//myexe 11 21