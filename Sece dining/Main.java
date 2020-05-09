#include<iostream>
#include<string>
using namespace std;
int main()
{
  string door;
  int rail;
  cin>>door>>rail;
  if(door.compare("front")==0)
  {
    if(rail==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else if(door.compare("rear")==0)
  {
    if(rail==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
  //Type your code here.
}