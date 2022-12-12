#include<iostream>
using namespace std;

template <class T>
class Arithematic
{
    public:
    T No1;
    T No2;

    Arithematic(T a,T b)
    {
        No1 =a;
        No2 =b;

    }
    T Addition()
    {
        T ans;
        ans = No1 + No2;
        return ans;
    }
    T Substraction()
    {
        T ans;
        ans= No1 - No2;
        return ans;
    }
};

int main()
{
    Arithematic <int>iobj(10,11);
    int iret = iobj.Addition();
    cout<<"Addition is:"<<iret<<"\n";

    Arithematic <double>dobj(10.9,11.5);
    double dret = dobj.Addition();
    cout<<"Addition is:"<<dret<<"\n";
    return 0;
}
//In this example we have crated two objects of class arithematic for each data type new classs gets created by the compiler, classed gets created  by the compiler called as template instantiation.