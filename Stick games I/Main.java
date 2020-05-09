#include<iostream>
using namespace std;
int main()
{
  int n, m, small;
  cin>>n>>m;
  if(n<m)
    small=n;
  else
    small=m;
  if(small%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
  //Type your code here.
}