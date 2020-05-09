#include<iostream>
#include<ctype.h>
using namespace std;
int main()
{
  int sum1=0, sum2=0;
  string str;
  getline(cin, str);
  for(int i=0;str[i]!='\0';i++)
  {
    if(isdigit(str[i]) && (isalpha(str[i+1]) || str[i+1]=='\0'))
    {
      if(str[i]=='1')
        sum1+=1;
      else if(str[i]=='2')
        sum1+=2;
      else if(str[i]=='3')
        sum1+=3;
      else if(str[i]=='4')
        sum1+=4;
      else if(str[i]=='5')
        sum1+=5;
      else if(str[i]=='6')
        sum1+=6;
      else if(str[i]=='7')
        sum1+=7;
      else if(str[i]=='8')
        sum1+=8;
      else if(str[i]=='9')
        sum1+=9;
    }
    else if(isdigit(str[i]) && isdigit(str[i+1]))
    {
      if(str[i]=='1')
        sum2+=10;
      else if(str[i]=='2')
        sum2+=20;
      else if(str[i]=='3')
        sum2+=30;
      else if(str[i]=='4')
        sum2+=40;
      else if(str[i]=='5')
        sum2+=50;
      else if(str[i]=='6')
        sum2+=60;
      else if(str[i]=='7')
        sum2+=70;
      else if(str[i]=='8')
        sum2+=80;
      else if(str[i]=='9')
        sum2+=90;
      if(str[i+1]=='1')
        sum2+=1;
      else if(str[i+1]=='2')
        sum2+=2;
      else if(str[i+1]=='3')
        sum2+=3;
      else if(str[i+1]=='4')
        sum2+=4;
      else if(str[i+1]=='5')
        sum2+=5;
      else if(str[i+1]=='6')
        sum2+=6;
      else if(str[i+1]=='7')
        sum2+=7;
      else if(str[i+1]=='8')
        sum2+=8;
      else if(str[i+1]=='9')
        sum2+=9;
      i++;
    }
  }
  cout<<sum1+sum2;
  //Type your code here.
}