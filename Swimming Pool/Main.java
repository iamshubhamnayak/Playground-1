#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int len, lit;
  cin>>len>>lit;
  len*=10;
  if(pow(len,3)>lit)
    cout<<"Can store";
  else
    cout<<"Cannot store";
  //Type your code here.
}