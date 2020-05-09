#include<iostream>
using namespace std;
int main()
{
  string a;
  getline(cin, a);
  cout<<"The output string is ";
  for(int i=0;a[i]!='\0';i++)
  {
    if(a[i]=='A'||a[i]=='a'||a[i]=='E'||a[i]=='e'||a[i]=='I'||a[i]=='i'||a[i]=='O'||a[i]=='o'||a[i]=='U'||a[i]=='u')
      continue;
    cout<<a[i];
  }
  //Type your code here.
}