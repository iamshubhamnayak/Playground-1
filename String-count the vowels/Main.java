#include<iostream>
using namespace std;
int main()
{
  int count=0;
  string str;
  getline(cin, str);
  for(int i=0;str[i]!='\0';i++)
  {
    if(str[i]=='A'||str[i]=='a'||str[i]=='E'||str[i]=='e'||str[i]=='I'||str[i]=='i'||str[i]=='O'||str[i]=='o'||str[i]=='U'||str[i]=='u')
      count++;
  }
  cout<<"Number of vowels: "<<count;
  //Type your code here.
}