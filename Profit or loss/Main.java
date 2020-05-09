#include<iostream>
using namespace std;
int main()
{
  float cp, sp;
  int dif;
  cin>>cp>>sp;
  sp = sp * 12;
  if(cp>sp)
  {
    dif = cp-sp;
    cout<<"Loss : Rs."<<dif;
  }
  else if(cp<sp)
  {
    dif = sp-cp;
    cout<<"Profit : Rs."<<dif;
  }
  else
    cout<<"No profit nor loss";
  //Type your code here.
}