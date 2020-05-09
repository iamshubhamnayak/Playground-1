#include<iostream>
using namespace std;
int main()
{
  int flag=0;
  string str1, str2;
  getline(cin, str1);
  getline(cin, str2);
  for(int i=0;str1[i]!='\0';i++)
  {
    if(str1[i]!=str2[i])
      flag++;
  }
  if(flag==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  //Type your code here.
}