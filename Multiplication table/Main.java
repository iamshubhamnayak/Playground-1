#include<iostream>
using namespace std;
int main()
{
  int n, m, i=1;
  cout<<"Enter n\n";
  cin>>n;
  cout<<"Enter m\n";
  cin>>m;
  cout<<"The multiplication table of "<<n<<" is\n";
  while(i<=m)
  {
    cout<<i<<"*"<<n<<"="<<i*n<<endl;
    i++;
  }
  //Type your code here.
}