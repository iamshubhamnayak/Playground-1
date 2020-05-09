#include<iostream>
using namespace std;
int main()
{
  int n, count=0;
  float score=0;
  while(count<3)
  {
    cin>>n;
    if(n>0 && n%2!=0)
    {
      score+=1;
      count++;
    }
    else if(n>0 && n%2==0)
      score-=0.5;
    else if(n<0)
    {
      score-=1;
      break;
    }
  }
  cout<<score;
  //Type your code here.
}