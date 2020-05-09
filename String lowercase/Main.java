#include<iostream>
using namespace std;
int main()
{
  string str;
  getline(cin, str);
  for (int i = 0; str[i]!='\0'; i++)
  	{
  		if(str[i] >= 'A' && str[i] <= 'Z')
  		{
  			str[i] = str[i] +32;
		}
  	}
  cout<<"The output string is "<<str;
  //Type your code here.
}