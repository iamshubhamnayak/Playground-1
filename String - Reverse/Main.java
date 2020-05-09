#include<iostream>
using namespace std;
int main()
{
  int n;
  string a;
  getline(cin, a);
  for(n=0;a[n]!='\0';n++);
  cout<<"The reversed String is ";
  for(int i=n-1;i>=0;i--)
    cout<<a[i];
  cout<<".";
  //Type your code here.
}