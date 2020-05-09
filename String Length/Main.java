#include<iostream>
using namespace std;
int main()
{
  int i;
  string str;
  getline(cin, str);
  for(i=0;str[i]!='\0';i++);
  cout<<"The length of word "<<str<<" is "<<i;
  //Type your code here.
}