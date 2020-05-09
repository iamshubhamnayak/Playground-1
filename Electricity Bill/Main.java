#include<iostream>
using namespace std;
int main()
{
  int unit;
  float bill;
  cin>>unit;
  if(unit<=200)
    bill = unit *0.5;
  else if(unit<=400)
    bill = 100+(unit *0.65);
  else if(unit<=600)
    bill = 200+(unit *0.80);
  else
    bill = 425+(unit *1.25);
  cout<<"Rs."<<int(bill);
  //Type your code here.
}