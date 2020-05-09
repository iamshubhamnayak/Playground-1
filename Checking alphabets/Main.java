#include<iostream>
using namespace std;
int main()
{
  char ch;
  int num;
  cin>>ch;
  num=ch;
  if(!((num>=65 && num<=90)||(num>=97 && num<=122)))
    cout<<"Not an alphabet";
  else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    cout<<"Vowel";
  else
    cout<<"Consonant";
  //Type your code here.
}