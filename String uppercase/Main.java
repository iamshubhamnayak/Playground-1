#include<iostream>
using namespace std;
int main()
{
  string str;
  getline(cin, str);
  for (int i = 0; str[i]!='\0'; i++)
  	{
  		if(str[i] >= 'a' && str[i] <= 'z')
  		{
  			str[i] = str[i] -32;
		}
  	}
  cout<<"String in uppercase is "<<str;
  //Type your code here.
}