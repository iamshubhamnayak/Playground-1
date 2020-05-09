#include<iostream>
using namespace std;
int main()
{
  float r, h, input, time, tot, timetaken;
  cin>>r>>h>>input>>time;
  tot = 3.14 * r * r * h;
  timetaken = tot / input;
  if(timetaken<time)
  	cout<<"The tank can be filled within "<<time<<" hours";
  else
    cout<<"The tank cannot be filled within "<<time<<" hours";
  //Type your code here.
}