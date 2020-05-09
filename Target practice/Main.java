#include<iostream>
using namespace std;
int main()
{
  int n, sum=0, count=0, score;
  cin>>n;
  while(sum<n)
  {
    cin>>score;
    sum+=score;
    count++;
  }
  cout<<"The number of turns is "<<count;
  //Type your code here.
}