#include<iostream>
using namespace std;

class Arithematic
{
    public:
    int No1,No2;

    Arithematic(int a,int b)
    {
        No1 =a;
        No2 =b;

    }
    int Addition()
    {
        int ans=0;
        ans = No1 + No2;
        return ans;
    }
    int Substraction()
    {
        int ans=0;
        ans= No1 - No2;
        return ans;
    }
};