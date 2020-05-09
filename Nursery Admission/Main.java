#include<iostream>
using namespace std;
int main()
{
  int i;
  string str;
  getline(cin, str);
  for(i=0;str[i]!='\0';i++);
  cout<<"The number of letters in the name is "<<i;
  //Type your code here.
}