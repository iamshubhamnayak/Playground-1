#include<iostream>
using namespace std;
int main()
{
  int l1, b1, l2, b2, l3, b3;
  cin>>l1>>b1>>l2>>b2>>l3>>b3;
  if(((l1>=l2+b2) || (b1>=b2+b3)) && (l1>l2) && (l1>l3) && (b1>b2) && (b1>b3))
    cout<<"Raj can fix both painting";
  else
    cout<<"Raj cannot fix both painting";
  //Type your code here.
}