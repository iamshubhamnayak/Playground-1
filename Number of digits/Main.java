#include<iostream>
using namespace std;
int num(int n, int i)
{
  if(n==0)
    return i;
  return num(n/10,i+1);
}
int main()
{
  int n;
  cout<<"Enter the value of n\n";
  cin>>n;
  cout<<"The number of digits in "<<n<<" is "<<num(n,0);
  //Type your code here.
}