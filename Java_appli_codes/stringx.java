//for string use java.io package ie.inputoutput
//In java character i of 2 bytes bcz for upporting unicode
//in c string is char array which ends with '\0'
// in c size of"Hello" is 6 bytes as 5 charc one '\0' but in java it is 10 bytes a char of 2 byte and no '\0'
//string literal or data in string pool is mutable but string object is imutable in nature
// 3 classes in string-String,stringBuffer,Stringbulider -.string is imutable whereas other two are mutable
//stringbuffer is synchronised and stringBuilder is not synchronised
//synchornised;line madhe cake watap, non-synchronised-gondhal
import java.io.*;
public class stringx {
    public static void main(String[] args) 
    {
        //String literal
       String str1 = "Hello";
       String str2 = "World";
       
       System.out.println(str1);   //Hello
       System.out.println(str1.length());   //5

       String str3 = str1+str2;  //Inside internal opearator overloading
       System.out.println(str3);  //HelloWorld
       String str4 ="Hello";
       
       //String objects 
       
       String str5 = new String("Hello");
       String str6 = new String("World");
       String str7 = new String("Hello");

       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str4);
       System.out.println(str5);
       System.out.println(str6);
       System.out.println(str7);

    }
}
//If we create the string without using the new keyboard,then it is called string litral,but if we creater the string with new keyword then it is called string objects.for string litrals memory gets allocated in the string litral pool,and if we created by object then it gets allocated in the heap section.

/*
 * If we create the string using string litral then memory gets alocated in string pool ie.in string pool if we created the same string then same memory gets allocated for the string
 * And if we create the string using object then memeory gets allocated in the heap section ,in that if we created the same string multiple times then also differnt memory address gets allocated
 */
