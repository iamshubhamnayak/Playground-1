#include<iostream>
#include<string>
using namespace std;
int main()
{
  int x, y, z;
  string l;
  cin>>x>>y>>z>>l;
  if(l.compare("L1")==0)
  {
    if(y<z)
      cout<<"L2";
    else
      cout<<"L3";
  }
  else if(l.compare("L2")==0)
  {
    if(x<z)
      cout<<"L1";
    else
      cout<<"L3";
  }
  else if(l.compare("L3")==0)
  {
    if(x<y)
      cout<<"L1";
    else
      cout<<"L2";
  }
  //Type your code here.
}