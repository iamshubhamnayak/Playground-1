#include<iostream>
using namespace std;
int main()
{
  int row, col, no;
  cin>>row>>col>>no;
  if((no>=1 && no<=col)||(no%col==0)||(no%col==1))
    cout<<"Yes";
  else
    cout<<"No";
  //Type your code here.
}