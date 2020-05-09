#include<iostream>
using namespace std;
int main()
{
  int n, i, j;
  char temp;
  string str;
  getline(cin, str);
  for(n=0;str[n]!='\0';n++);
  for (i = 0; i < n-1; i++) 
  {
  	for (j = i+1; j < n; j++) 
    {
		if (str[i] > str[j]) 
        {
			temp = str[i];
			str[i] = str[j];
			str[j] = temp;
		}
	 }
   }
  cout<<"The output string is "<<str;
  //Type your code here.
}