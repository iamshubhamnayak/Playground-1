#include<iostream>
using namespace std;
int main()
{
  int a, b, c, d, dol, cent;
  cin>>a>>b>>c>>d;
  dol = a + c;
  cent = b + d;
  if(cent >= 100)
  {
    dol++;
    cent-=100;
  }
  cout<<dol<<endl<<cent;
  //Type your code here.
}