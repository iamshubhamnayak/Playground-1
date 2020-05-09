#include<iostream>
using namespace std;
int main()
{
  int len, flag=1, i, j;
  string str;
  getline(cin, str);
  for(len=0;str[len]!='\0';len++);
  for(i=0,j=len-1;i<len/2;++i,--j)
	{
		if(str[j]!=str[i])
			flag=0;
	}
  if(flag)
    cout<<"Palindrome";
  else
    cout<<"Not a Palindrome";
  //Type your code here.
}