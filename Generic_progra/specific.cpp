#include <iostream>
using namespace std;

int Addition(int iNo1,int iNo2)
{
    int Ans=0;
    Ans = iNo1+ iNo2;
    return Ans;
}

float Addition(float iNo1,float iNo2)
{
    float Ans=0;
    Ans = iNo1+ iNo2;
    return Ans;
}

double Addition(double iNo1,double iNo2)
{
    double Ans=0;
    Ans = iNo1+ iNo2;
    return Ans;
}

int main()
{
    int x=10,y=11,iRet=0;
    iRet = Addition(x,y);
    cout<<"Addition is :"<<iRet<<"\n";

    float a=10.8,b=11.5,fRet=0.0;
    fRet = Addition(a,b);
    cout<<"Addition is :"<<fRet<<"\n";

    double d1=17.8,d2=19.5,dRet=0.0;
    dRet = Addition(d1,d2);
    cout<<"Addition is :"<<dRet<<"\n";

    return 0;
}