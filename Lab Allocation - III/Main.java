#include<iostream>
using namespace std;
int main()
{
  int x, y, z, a, count = 0;
  cin>>x>>y>>z>>a;
  if(a<=x)
    count++;
  if(a<=y)
    count++;
  if(a<=z)
    count++;
  cout<<count;
  //Type your code here.
}