#include<iostream>
using namespace std;
int main()
{
  string a, b;
  getline(cin, a);
  getline(cin, b);
  for(int i=0;a[i]!='\0';i++)
  {
    for(int j=0;b[j]!='\0';j++)
    {
      if(a[i]==b[j])
        b[j]=' ';
    }
  }
  for(int j=0;b[j]!='\0';j++)
  {
    if(b[j]!=' ')
      cout<<b[j];
  }
  //Type your code here.
}