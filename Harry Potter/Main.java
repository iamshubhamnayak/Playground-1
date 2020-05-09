#include<iostream>
using namespace std;
int main()
{
  int dig, first, last;
  cin>>dig;
  last = dig%10;
  first = dig/1000;
  cout<<first+last;
}