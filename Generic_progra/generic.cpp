#include <iostream>
using namespace std;

template <class T>
T Addition(T iNo1,T iNo2)
{
    T Ans=0;
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
