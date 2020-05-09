#include<iostream>
using namespace std;
int main()
{
  float speed, dist, time;
  cin>>speed>>dist>>time;
  speed = speed/3600.00;
  if(dist<speed*time)
    cout<<"Yes";
  else
    cout<<"No";
  //Type your code here.
}