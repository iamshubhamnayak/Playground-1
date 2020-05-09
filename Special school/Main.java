#include<iostream>
using namespace std;
int main()
{
  int i, j, flag=0;
  string a, b;
  getline(cin, a);
  getline(cin, b);
  for(j=0;b[j]!='\0';j++);
  j--;
  for(i=0;a[i]!='\0';i++,j--)
  {
    if(a[i]!=b[j])
      flag++;
  }
  if(flag==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  //Type your code here.
}