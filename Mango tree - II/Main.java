#include<iostream>
using namespace std;
int main()
{
  int row, col, no;
  cin>>row>>col>>no;
  if((no>=1 && no<=row)||(no>(col-1)*row && no<=(row*col))||(no%row==1))
    cout<<"Yes";
  else
    cout<<"No";
  //Type your code here.
}