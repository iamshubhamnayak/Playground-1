#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a, b, c, d, x, y;
  int dist, rad;
  cin>>a>>b>>x>>c>>d>>y;
  dist = sqrt(pow(c-a,2)+pow(d-b,2));
  rad = x+y;
  if(dist == rad)
    cout<<"Tangential";
  else if(dist < rad)
    cout<<"Overlap";
  else if(dist > rad)
    cout<<"Do not Overlap";
  //Type your code here.
}