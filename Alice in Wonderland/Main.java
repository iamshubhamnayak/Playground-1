#include<iostream>
using namespace std;
int main()
{
  int dig, fin=0, rem;
  cin>>dig;
  while(dig!=0)
  {
    rem=dig%10;
    fin+=rem;
    dig/=10;
  }
  cout<<"Alice must go in path-"<<fin;
  //Type your code here.
}