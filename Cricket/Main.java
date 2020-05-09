#include<iostream>
#include<math.h>
#include<bits/stdc++.h> 
using namespace std;
int main()
{
  int ball, bowl, over, a;
  int _over, _ball;
  float runrate, reqrate, tar, run, x, y, z;
  cin>>ball>>tar>>run>>bowl;
  a=ball/6;
  cout<<a<<endl;
  x=bowl/6;
  y=float(bowl%6)/10;
  z=x+y;
  cout<<z<<endl;
  cout<<fixed<<setprecision(1)<<run/z<<endl;
  runrate= ceilf((run/z) * 10) / 10;
  reqrate=ceilf((tar/a)*10)/10;
  cout<<fixed<<setprecision(1)<<tar/a<<endl;
  if(runrate>reqrate)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  //Type your code here.
}