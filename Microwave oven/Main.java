#include<iostream>
using namespace std;
int main()
{
  int item;
  float time;
  cin>>item>>time;
  if(item == 2)
  {
    time += time*0.5;
    cout<<time;
  }
  else if(item == 3)
  {
    time +=time;
    cout<<time;
  }
  else
    cout<<"Number of items is more";
  //Type your code here.
}