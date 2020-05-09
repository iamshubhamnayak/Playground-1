#include<iostream>
using namespace std;
int main()
{
  int pri, amt, rate, intr, tim;
  float dis, fin;
  cin>>pri>>rate>>tim;
  intr = (pri * rate * tim)/ 100;
  amt = pri + intr;
  dis = intr * 0.02;
  fin = amt - dis;
  cout<<intr<<"\n"<<amt<<"\n"<<dis<<"\n"<<fin;
  //Type your code here.
}